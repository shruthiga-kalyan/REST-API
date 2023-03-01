package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BookDetails;
import com.example.demo.Repository.BookRepos;

@Service
public class BookService {

	@Autowired
	private BookRepos repo;

	public boolean addDetails(BookDetails b) {
		if ((!Objects.isNull(b.getAuthorName())) && (!Objects.isNull(b.getBookName())) && (b.getId() != 0)
				&& (b.getPrice() != 0) && (b.getQuantity() != 0)) 
		{
			repo.save(b);
			return true;
		} else
			return false;

	}

	public BookDetails getDetailsId(int id) {
		return repo.findById(id).get();
	}

	public List<BookDetails> getDetails() {
		List<BookDetails> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}

	public boolean DeleteDetails(int id) {
		Optional<BookDetails> a = repo.findById(id);
		if (a.isPresent()) {
			repo.deleteById(id);
			return true;
		}

		else {
			return false;
		}
	}

	public BookDetails updateDetails(int id, BookDetails b) {
		return repo.saveAndFlush(b);

	}

}
