package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.BookDetails;

public interface BookRepos extends JpaRepository<BookDetails,Integer>{

}
