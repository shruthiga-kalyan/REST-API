package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employee;

public interface Reposi extends JpaRepository<Employee,Integer>{

}
