package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repo.ClassRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentService 
{
	@Autowired
	private ClassRepo repo1;
	
	public StudentEntity addStudent(StudentEntity obj)
	{
		return repo1.save(obj);
	}
	
	public List<StudentEntity> getStudent()
	{
		List<StudentEntity> arr= new ArrayList<>();
		arr=repo1.findAll();
		return arr;
	}
	
	
}
