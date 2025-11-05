package com.main.services;

import java.util.List;
import java.util.Optional;

import com.main.entites.Employee;

public interface EmployeeService {
public void deleteId(int id);
//select2,update
public Employee addemployee(Employee emp);
public List<Employee> displayEmp();
public Optional<Employee> getEmployeeByid(int id);
public Employee updateEmployeeDetails(int id,Employee ee);
}
