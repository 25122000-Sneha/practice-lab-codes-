package com.ltimmappingdemo.manytoonedemonew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimmappingdemo.manytoonedemonew.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    

}
