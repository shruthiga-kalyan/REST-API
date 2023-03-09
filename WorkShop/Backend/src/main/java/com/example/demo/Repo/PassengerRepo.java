package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.PassengerEntity;

public interface PassengerRepo extends JpaRepository<PassengerEntity,Integer> {

}
