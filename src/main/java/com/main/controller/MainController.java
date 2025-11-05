package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entites.Employee;
import com.main.services.EmployeeService;

@RestController
public class MainController {
@Autowired EmployeeService employeeService;
@DeleteMapping("/delete/{id}")
public   ResponseEntity<Object> deleteById2(@PathVariable int id){
	employeeService.deleteId(id);
	
	return ResponseEntity.noContent().build();
}
//@PostMapping("/addEmployees")
//public Employee addEmployee(@RequestBody Employee e1) {
//	return employeeService.addemployee(e1);
//
//}
@GetMapping("/getDetails")
public List<Employee> getEmployee() {
	List<Employee> ls=employeeService.displayEmp();
	return ls;
	
}
@GetMapping("/getDetails/{id}")
public Optional<Employee> getEmpById(@PathVariable int id){
	Optional<Employee> ee=Optional.ofNullable(employeeService.getEmployeeByid(id).orElse(null));
	
	return ee;
	
}
@PutMapping("/updateDetails/{id}")
public Employee updateEmployee(@PathVariable int id,@RequestBody Employee ee) {
	Employee es=employeeService.updateEmployeeDetails(id, ee);
	return es;
}}