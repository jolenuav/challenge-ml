import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class CustomHttpService {
  headers;

  constructor(private http: HttpClient) {}

  /**
   * Se consume servicios http
   * @param method Verbos [GET, POST, PUT, DELETE]
   * @param url URL
   * @param endpoint endpoint
   * @param params Object
   * @param local En caso de querer consumir un servicio local
   */
  async execute(
    method: string,
    url: string,
    endpoint: string,
    params?: any
  ): Promise<any> {
    try {
      const options = {
        params,
      };

      switch (method) {
        case METHOD.get:
          return this.http
            .get(url + endpoint, options)
            .pipe(catchError((e) => throwError(e)))
            .toPromise();

        case METHOD.post:
          return this.http
            .post(url, params, options)
            .pipe(catchError((e) => throwError(e)))
            .toPromise();

        case METHOD.put:
          return this.http
            .put(url, params, options)
            .pipe(catchError((e) => throwError(e)))
            .toPromise();

        default:
          return null;
      }
    } catch (err) {
      return err;
    }
  }
}

export const METHOD = {
  delete: 'DELETE',
  get: 'GET',
  post: 'POST',
  put: 'PUT',
};
