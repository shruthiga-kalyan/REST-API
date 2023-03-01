package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")

public class Employee {

	public Employee() {
	}

	public Employee(int id, String emp_name, int emp_age, int salary) {
		super();
		this.id = id;
		Emp_name = emp_name;
		Emp_age = emp_age;
		Salary = salary;
	}

	@Id
	private int id;

	private String Emp_name;

	private int Emp_age;

	private int Salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getEmp_age() {
		return Emp_age;
	}

	public void setEmp_age(int emp_age) {
		Emp_age = emp_age;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}
