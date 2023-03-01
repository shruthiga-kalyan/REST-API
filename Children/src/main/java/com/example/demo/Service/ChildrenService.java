package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Children;
import com.example.demo.Repository.ChildrenRepo;

@Service
public class ChildrenService {

	@Autowired
	private ChildrenRepo repo;
	
	

	public Children getChildrenById(int id) {

		return repo.findById(id).get();

	}

	public List<Children> getChildren() {
		List<Children> l = new ArrayList<>();
		l = repo.findAll();
		return l;
	}

	public boolean addChildren(Children obj) {

		if (!Objects.nonNull(obj.getBabyFirstName()) && (!Objects.nonNull(obj.getBabyLastName()))
				&& (!Objects.nonNull(obj.getFatherName())) && (!Objects.nonNull(obj.getMotherName()))
				&& (!Objects.nonNull(obj.getAddress())))
			return false;
		else {
			repo.save(obj);
			return true;
		}
	}

	public Page<Children> WithPagination(int offset, int pagesize) {
		Pageable p = PageRequest.of(offset, pagesize);
		Page<Children> c = repo.findAll(p);
		return c;
	}

//	public List<Children> WithPageAndSort(int offset, int pagesize, String field) {
//		Pageable p = PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field));
//		Page<Children> c = repo.findAll(p);
//		return c.toList();
//	}
	public List<String> WithPageAndSort(int offset, int pagesize, String field)
	{
		Pageable p = PageRequest.of(offset, pagesize);
		Page<Children> c = repo.findAll(p);
		List<Children> arr = new ArrayList<>();
		arr = c.getContent();
		List<String> ans = new ArrayList<>();
		switch(field)
		{
		case "babyFirstName":
			for(Children c1 : arr)
                ans.add(c1.getBabyFirstName());
			break;
		case "babyLastName":
			for(Children c1 : arr)
                ans.add(c1.getBabyLastName());
			break;
		case "motherName":
			for(Children c1 : arr)
                ans.add(c1.getMotherName());
			break;
		case "fatherName":
			for(Children c1 : arr)
                ans.add(c1.getFatherName());
			break;
		case "address":
			for(Children c1 : arr)
                ans.add(c1.getAddress());
			break;
		default:
		    throw new IllegalArgumentException("Invalid field name: " + field);
		}
		return ans;
    }

	public void deleteChildren(int id) {
		repo.deleteById(id);
	}

}
