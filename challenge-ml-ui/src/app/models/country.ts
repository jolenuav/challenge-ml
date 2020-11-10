import Language from './laguage';

export default interface Country {
  countryName: string;
  countryISO: string;
  languages: Language[];
  hours: string[];
  distanceBA: number;
  currency: string;
  rate: any;
}
