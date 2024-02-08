package com.practice1.practicemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice1.practicemapping.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
