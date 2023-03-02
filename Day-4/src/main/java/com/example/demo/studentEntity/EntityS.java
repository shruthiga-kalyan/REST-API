package com.example.demo.studentEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@Entity
@Table (name="Student")

public class EntityS {

	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="Student Name")
	private String name;
	
	@Column(name="Dept Name")
	private String dept;
	
	
	
	@Column(name="Mail ID")
	private String mail;
	
	
	
	
	//getters
	public String getName()
	{
		return name;
	}
	
	
	
	public String getDept()
	{
		return dept;
	}
	
	
	public String getMail()
	{
		return mail;
	}
	
	public int getId()
	{
		return id;
	}
	
	//setter
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	
	public void  setDept(String dept)
	{
		this.dept=dept;
	}
	
	
	public void settMail(String mail)
	{
		this.mail=mail;
	}
	
	
	
	public EntityS()
	{}

	public EntityS(String name , int id,String dept , String mail)
	{
		this.id=id;
		
		this.name=name;
		
		this.dept=dept;
		this.mail=mail;
		
	}
	




}
