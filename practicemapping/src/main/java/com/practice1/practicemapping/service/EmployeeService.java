package com.practice1.practicemapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice1.practicemapping.entity.Address;
import com.practice1.practicemapping.entity.Employee;
import com.practice1.practicemapping.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id)
    {
        return employeeRepository.getById(id);
    }

    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }





}
