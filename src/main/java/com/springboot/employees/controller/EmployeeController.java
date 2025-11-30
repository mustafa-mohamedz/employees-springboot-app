package com.springboot.employees.controller;

import com.springboot.employees.entity.Employee;
import com.springboot.employees.request.EmployeeRequest;
import com.springboot.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAllEmployees(){
        return employeeService.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @GetMapping("/{id}")
    public Employee findEmployeesByID(@PathVariable long id){
        return employeeService.getEmployeeByID(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody EmployeeRequest employeeRequest) {
        return employeeService.updateEmployee(id,employeeRequest);
    }
}
