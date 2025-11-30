package com.springboot.employees.service;

import com.springboot.employees.dao.EmployeeDAO;
import com.springboot.employees.entity.Employee;
import com.springboot.employees.request.EmployeeRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyeeServiceImp implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.getAllEmployees();
    }

    @Transactional
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }

    @Override
    public Employee updateEmployee(long id, EmployeeRequest employeeRequest) {
        return null;
    }
}
