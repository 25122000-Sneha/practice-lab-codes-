import { Injectable } from '@angular/core';
import { Employee } from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employeeList : Employee[] = [
    new Employee(1001, 'Sumitra G', 25000),
    new Employee(1002, 'Ramu H M', 20000),
    new Employee(1003, 'Rani', 40000),
    new Employee(1004, 'Yubraj', 50000)
  ];

  constructor() { }

  getEmployees() : Employee[]
  {
    return this.employeeList;
  }

  addEmployee(employee : Employee) : void {
    this.employeeList.push(employee);
  }
}
