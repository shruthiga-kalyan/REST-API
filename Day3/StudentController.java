package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;


@RestController
public class StudentController
{ @Autowired
	private StudentService stuService;

	@PostMapping("/add")
	public StudentEntity postStudent(@RequestBody StudentEntity stu)
	{
		return stuService.addStudent(stu);
	}
	
	@GetMapping("/show")
	public List<StudentEntity> showStudent()
	{
		List<StudentEntity> alist= new ArrayList<>();
		alist=stuService.getStudent();
		return alist;
		
	}
  
  
}
