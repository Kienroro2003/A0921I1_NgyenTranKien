import {AbstractControl, Form, FormGroup, ValidationErrors, ValidatorFn} from "@angular/forms";

export class CustomerValidators {
  static fromToDate(fromDateField: string, toDateField: string, errorName: string = 'fromToDate'): ValidatorFn {
    return (formGroup: AbstractControl): { [key: string]: boolean } | null => {
      const fromDate = formGroup.get(fromDateField)?.value
      const toDate = formGroup.get(toDateField)?.value;
      // Ausing the fromDate and toDate are numbers. In not convert them first after null check
      if ((fromDate !== null && toDate !== null) && fromDate > toDate) {
        return {[errorName]: true};
      }
      return null;
    };
  }

  static formToday(fromDate: string, errorName: string = 'startDate'): ValidatorFn {
    return (formGroup: AbstractControl): { [key: string]: boolean } | null => {
      const start = formGroup.get(fromDate)?.value;
      const startDate = new Date(start)
      const today = new Date();
      if (startDate !== null && startDate < today) {
        return {[errorName]: true}
      }
      return null;
    }
  }

  static gte(control: AbstractControl): ValidationErrors | null {

    const v = +control.value;

    if (isNaN(v)) {
      return {'gte': true, 'requiredValue': 0}
    }

    if (v <= 0) {
      return {'gte': true, 'requiredValue': 0}
    }

    return null

  }
}
