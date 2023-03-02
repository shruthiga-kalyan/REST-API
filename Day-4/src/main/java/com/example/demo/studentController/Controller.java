package com.example.demo.studentController;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.studentEntity.EntityS;
import com.example.demo.studentService.Service;




@RestController

public class Controller {
	
	
	@Autowired
	private Service studS;
	
	@GetMapping("/")
	public List<EntityS> get()
	{
		List<EntityS> list= new ArrayList<>();
		list=studS.getStudent();	
		return list;
	}

	@PostMapping("/")
	public void post(@RequestBody EntityS studE)
	{
		studS.postStudent(studE);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id)
	{
		studS.deleteStudent(id);
	}
	
	@PostMapping("/{id}")
	public void post(@PathVariable int id,EntityS studE)
	{
		studS.updateStudent(id,studE);
	}
}
