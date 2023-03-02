package com.example.demo.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.studentEntity.EntityS;

public interface Repo extends JpaRepository<EntityS , Integer> {

}
