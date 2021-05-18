import { Component, OnInit } from '@angular/core';
import { iif } from 'rxjs';
import { EmployeeService } from './employee.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'services';

  emps: any[];

  emp: any;

  constructor(private es: EmployeeService) {

  }

  ngOnInit() {
    this.emps = this.es.fildAllEmployees();
    this.emp = this.es.findById(7);

    if (this.emp != null) {
      console.log(JSON.stringify(this.emp));
    }

  }


  // data operattions









}
