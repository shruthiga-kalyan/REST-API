package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.Entity.Entity;
import com.example.demo.Repo.Paging;
import com.example.demo.Repo.Repo;


public class Service {


	private Repo childR;
	
	@Autowired
	private Paging pg;
	

	public List<Entity> getAllDetails()
    {
   	 Pageable p=PageRequest.of(0,2);
   	 Page<Entity> s=pg.findAll(p);
   	 return s.toList();
   }
	public List<Entity> sort(){
		List<Entity>list=childR.findAll(Sort.by(Sort.Direction.ASC,"id"));
		return list;
	}
}