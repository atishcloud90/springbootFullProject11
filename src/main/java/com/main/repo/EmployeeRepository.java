package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
