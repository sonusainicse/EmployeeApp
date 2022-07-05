package com.employeeappdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeappdemo.model.Employee;



public interface EmpoyeeRepository extends JpaRepository<Employee, Long> {

}
