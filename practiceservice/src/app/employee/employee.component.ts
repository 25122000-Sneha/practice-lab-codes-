import { Component, OnInit } from '@angular/core';
import { Employee } from '../models/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit{

  employees : Employee[] = [];

  constructor(private employeeService : EmployeeService)
  {
    this.employees = this.employeeService.employeeList;
  }
  ngOnInit(): void {
   
  }

  addNewEmployee() : void {

    let employee : Employee = {
      id : 1005,
      empName : 'Hari',
      empSalary : 60000
    };
    this.employeeService.addEmployee(employee);
  }



}
