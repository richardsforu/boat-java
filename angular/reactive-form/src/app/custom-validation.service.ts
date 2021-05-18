import { Injectable } from '@angular/core';
import { AbstractControl, ValidatorFn } from '@angular/forms';
import * as moment from 'moment';
@Injectable({
  providedIn: 'root'
})
export class CustomValidationService {

  inventoryDateValidator(): ValidatorFn {

    return (control: AbstractControl): { [key: string]: boolean } => {
      if (!control.value) {
        return null;
      }

      ///-------------
      if (control && control.value && !moment(control.value, 'DD-MM-YYYY', true).isValid()) {
        return { 'invalidDate': true }
      }
    }


    //-----------------

    // if moment.js is used, then no need oif using any redEx for date parrern



    return null;
  }


  constructor() { }
}
