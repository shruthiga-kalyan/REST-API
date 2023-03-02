package com.example.demo.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Entity.Entity;

public interface Paging  extends PagingAndSortingRepository<Entity , Integer>{

}
