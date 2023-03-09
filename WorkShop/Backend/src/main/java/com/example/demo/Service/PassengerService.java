package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.PassengerEntity;
import com.example.demo.Repo.PassengerRepo;

@Service
public class PassengerService {
	
	@Autowired 
	public PassengerRepo passR;
	
	//get passengers
	public List<PassengerEntity> getPass(PassengerEntity passE)
	{
		return passR.findAll();
	}
	
	//add passengers
		public PassengerEntity addPass(PassengerEntity passE)
		{
			return passR.save(passE);
		}
		
	//update name
		public PassengerEntity updateById(PassengerEntity passE,int id)
		{
			return passR.saveAndFlush(passE);
		}
		
		//delete 
				public void deleteById(PassengerEntity passE, int id)
				{
					passR.delete(passE);
				}
						
}
