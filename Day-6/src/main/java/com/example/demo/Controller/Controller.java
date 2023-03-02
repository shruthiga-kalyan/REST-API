package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Entity;
import com.example.demo.Service.Service;

@RestController
public class Controller {


	@Autowired
	private Service childS;
	
	@GetMapping("/getChild")
    public List<Entity> getSortedDetails()
    {
    	return childS.sort();
    }

}
