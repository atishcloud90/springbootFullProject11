package com.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entites.Employee;
import com.main.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{


@Autowired EmployeeRepository repo;


    
	@Override
	public void deleteId(int id) {
		repo.deleteById(id);
		
	}
	@Override
	public Employee addemployee(Employee emp) {
		
		return repo.save(emp);
	}
	@Override
	public List<Employee> displayEmp() {
		
		return repo.findAll();
	}
	@Override
	public Optional<Employee> getEmployeeByid(int id) {
		Optional<Employee> opt1=repo.findById(id);
		if(opt1.isPresent()) {
			opt1.get();
			System.out.println("data is there");
		}else {
			System.out.println("not there");
		}
		return opt1;
	}
	@Override
	public Employee updateEmployeeDetails(int id, Employee ee) {
		Employee emp=getEmployeeByid(id).orElse(null);
		if(emp!=null) {
			emp.setDept("agri");
			repo.save(ee);
		}
return emp;
}
	}
	


