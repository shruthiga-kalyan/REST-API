package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController

public class ControllerClass {
	
	@Autowired
	private EmployeeService eserve;
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee Emp)
	{
		return eserve.addEmployee(Emp);
	}
	
	@GetMapping("/show")
	public List<Employee> getEmp()
	{
		List<Employee> arr=new ArrayList<>();
		arr=eserve.getEmployee();
		return arr;
	}

}
