import { Injectable } from '@angular/core';
import { EMPLOYEES } from '../app/data';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }

  fildAllEmployees(): any {
    return EMPLOYEES;
  }

  findById(id) {
    return EMPLOYEES.filter(emp => emp.id === id);
  }

  // edit

  // delete

  // find by name

  


}
