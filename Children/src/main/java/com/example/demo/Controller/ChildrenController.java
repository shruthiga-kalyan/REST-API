package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Children;
import com.example.demo.Service.ChildrenService;

@RestController
public class ChildrenController {

	@Autowired
	private ChildrenService cs;

	@GetMapping("/show")
	public List<Children> getDet() {
		List<Children> arr = new ArrayList<>();
		arr = cs.getChildren();
		return arr;
	}

	@GetMapping("/show/{id}")
	public Children getDetById(@PathVariable int id) {
		return cs.getChildrenById(id);
	}

	@PostMapping("/add")
	public boolean addDet(@RequestBody Children obj) {
		
		if(cs.addChildren(obj))
		    return true;
		else
			return false;
	}

	@GetMapping("/show/{offset}/{pagesize}")
	public Page<Children> Pagination(@PathVariable int offset, @PathVariable int pagesize) {
		return cs.WithPagination(offset, pagesize);
	}

//	@GetMapping("/show/{offset}/{pagesize}/{field}")
//	public List<Children> getSortingAndPagination(@PathVariable int offset, @PathVariable int pagesize,
//			@PathVariable String field) {
//		return cs.WithPageAndSort(offset, pagesize, field);
//	}
	
	@GetMapping("/show/{offset}/{pagesize}/{field}")
	public List<String> getSortingAndPagination(@PathVariable int offset, @PathVariable int pagesize,
			@PathVariable String field) {
		return cs.WithPageAndSort(offset, pagesize, field);
	}

	@DeleteMapping("/del/{id}")
	public void delDetails(@PathVariable int id) {
		cs.deleteChildren(id);
	}

}
