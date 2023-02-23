package com.example.demo.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.StudentEntity;
public interface ClassRepo extends JpaRepository<StudentEntity,Integer>
{

}
