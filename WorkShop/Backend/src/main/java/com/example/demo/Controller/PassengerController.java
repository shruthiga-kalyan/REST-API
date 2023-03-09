package com.example.demo.Controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.PassengerEntity;
import com.example.demo.Repo.PassengerRepo;
import com.example.demo.Service.PassengerService;

@CrossOrigin
@RestController

public class PassengerController {
	
	@Autowired
	public PassengerService passS;
	
	//get
	@GetMapping("/getPassenger")
	public List<PassengerEntity> get(PassengerEntity passE)
	{
		List<PassengerEntity> list= new ArrayList<>();
		list=passS.getPass(passE);
		return list;
		
	}
	
	//post 
	@PostMapping("/addPassenger")
	public void addPassenger(@RequestBody PassengerEntity passE)
	{
		passS.addPass(passE);
		
	}
	
//	//update- name
//	@PutMapping("/updatePassenger/{id}")
//	public PassengerEntity updateId(@PathVariable int id,PassengerEntity passE)
//	{
//		return passS.updateById(passE,id);
//	}
	
	@PutMapping("/updatePassenger/{id}")
    public PassengerEntity updateId(@PathVariable int id,PassengerEntity passE) {
		return passS.updateById(passE,id);     
         

    }
	
	//delete
	@DeleteMapping("/deletePassenger/{id}")
	public void delelete(@PathVariable int id ,PassengerEntity passE)
	{
		passS.deleteById(passE,id);
	}
					
					
}
