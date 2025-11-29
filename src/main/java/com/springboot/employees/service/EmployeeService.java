package com.springboot.employees.service;

import com.springboot.employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
