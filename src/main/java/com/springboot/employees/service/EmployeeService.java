package com.springboot.employees.service;

import com.springboot.employees.entity.Employee;
import com.springboot.employees.request.EmployeeRequest;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee addEmployee(Employee employee);
    Employee getEmployeeByID(long id);

    Employee updateEmployee(long id, EmployeeRequest employeeRequest);
}
