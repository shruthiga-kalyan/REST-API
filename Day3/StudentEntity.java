package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
@Table (name="Student")
public class StudentEntity 
{
	@Id
	@Column(name="ID")
	//to create table - @GeneratedValue
		private int id;
	
	@Column(name="NAME")
		private String name;
	
	@Column(name="MARK")
		private int mark;
	
	//getters
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMarks()
	{
		return mark;
	}
	
	//setters
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMarks(int mark)
	{
		this.mark=mark;
	}
	
	//parameterized constructor
	public StudentEntity(int id , String name, int mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	
	//default const
	public StudentEntity()
	{
		
	}
	
	
}