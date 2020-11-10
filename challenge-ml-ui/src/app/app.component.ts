import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { CustomHttpService, METHOD } from './custom-http.service';
import Country from './models/country';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  countries: any[] = [];
  disabledButtom = true;
  distanceMax = 0;
  distanceMin = 0;
  distanceAvg = 0;
  endpoint = '/country';
  ipControl = new FormControl('', [Validators.required]);
  error = false;
  showLoader = false;
  subscription: Subscription;
  url = 'http://localhost:8080';

  constructor(private httpService: CustomHttpService) {
    // this.subscription = this.ipControl.valueChanges.subscribe((ip: string) => {
    //   this.validateIP(ip);
    // });
  }

  async callService(): Promise<void> {
    this.showLoader = true;
    try {
      const resp: Country = await this.httpService.execute(
        METHOD.get,
        this.url,
        `${this.endpoint}/${this.ipControl.value}`
      );
      await this.addCountry(resp);
      await this.calculateDistances(resp);
    } catch (error) {
      console.error(error);
    } finally {
      this.showLoader = false;
    }
  }

  validateIP(): void {
    const ip = this.ipControl.value;
    this.disabledButtom = false;
    if (ip) {
      const fragmentIP = ip.split('.');
      if (fragmentIP.length !== 4) {
        this.ipControl.setValue(null);
        this.disabledButtom = true;
        return;
      }
      if (
        isNaN(Number(fragmentIP[0])) ||
        Number(fragmentIP[0]) === 0 ||
        Number(fragmentIP[0]) === 192
      ) {
        this.ipControl.setValue(null);
        this.disabledButtom = true;
        return;
      }
      fragmentIP.forEach((fragment: string) => {
        if (fragment.includes(' ') || fragment === '') {
          this.ipControl.setValue(null);
          this.disabledButtom = true;
        } else if (fragment.length > 3) {
          this.ipControl.setValue(null);
          this.disabledButtom = true;
        } else if (
          isNaN(Number(fragment.trim())) ||
          Number(fragment.trim()) > 255
        ) {
          this.ipControl.setValue(null);
          this.disabledButtom = true;
        }
      });
    }
  }

  addCountry(country: any): void {
    if (this.countries.length === 0) {
      country.count = 1;
      this.countries.push(country);
    } else if (
      !this.countries.find((item) => item.countryISO === country.countryISO)
    ) {
      country.count = 1;
      this.countries.push(country);
    } else {
      this.countries.map((item) => {
        if (item.countryISO === country.countryISO) {
          item.count = item.count + 1;
        }
      });
    }

    this.countries.forEach(
      (item) => (this.distanceAvg += item.distanceBA * item.count)
    );

    this.distanceAvg = this.distanceAvg / this.countries.length;
  }

  calculateDistances(country: Country): void {
    if (country.distanceBA >= this.distanceMax || this.distanceMax === 0) {
      this.distanceMax = country.distanceBA;
    }
    if (country.distanceBA <= this.distanceMin || this.distanceMin === 0) {
      this.distanceMin = country.distanceBA;
    }
  }

  convert(rate: any, country: Country): number {
    const result = rate[country.currency] / rate.USD;
    return result;
  }
}
