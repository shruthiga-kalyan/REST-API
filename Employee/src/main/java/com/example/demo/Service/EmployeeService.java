package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.Reposi;
@Service
public class EmployeeService {

	@Autowired
	private Reposi repo;
	
	public Employee addEmployee(Employee obj)
	{
		return repo.save(obj);
	}
	public List<Employee> getEmployee()
	{
		List<Employee> arr=new ArrayList<>();
		arr=repo.findAll();
		return arr;
	}
}
