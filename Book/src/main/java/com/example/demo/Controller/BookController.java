package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BookDetails;
import com.example.demo.Service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bs;
	
	@GetMapping("/show")
	public List<BookDetails> getDet()
	{
		return bs.getDetails();
	}
	
	@GetMapping("/show/{id}")
	public BookDetails getDetById(@PathVariable int id)
	{
		return bs.getDetailsId(id);
	}
	
	@PostMapping("/add")
	public boolean addDet(@RequestBody BookDetails b)
	{
		if(bs.addDetails(b))
		    return true;
		else
			return false; 
	}
	
	@DeleteMapping("/del/{id}")
	public boolean DelDet(@PathVariable int id)
	{
		
		
		if(bs.DeleteDetails(id))
		{
		    return true;
		}
		else
			return false;
	}
	
	@PutMapping("/update/{id}")
	public BookDetails updateDet(@PathVariable int id,@RequestBody BookDetails b)
	{
        return bs.updateDetails(id, b);
	}
}
