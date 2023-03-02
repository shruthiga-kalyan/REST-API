package com.example.demo.studentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.studentEntity.EntityS;
import com.example.demo.studentRepo.Repo;

public class Service {	

	@Autowired
	private Repo studR;
	
	
	//get
	public List<EntityS> getStudent()
	{
		List<EntityS> l=new ArrayList<>();
		l=studR.findAll();
		return l;}
	
	//post
	public EntityS postStudent(EntityS studE)
	{
		
		return studR.save(studE);
	}
	
	//delete
	public void deleteStudent(int id)
	{		
		 studR.deleteById(id);
	}
	
	//update
	public void updateStudent(int id,EntityS studE)
	{		
		 studR.saveAndFlush(studE);
	}

}
