package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Children;

public interface ChildrenRepo extends JpaRepository<Children,Integer> {

}
