package com.example.demo.Entity;




import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Passengers")
public class PassengerEntity {
	
	@Id	
	private int id;
	private String name;
	private int age;
	private long mob;
	private String start;	
	private String dest;
	
	private String train;
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public PassengerEntity(int id,String name,int age,long mob,String start,String dest,String train)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mob = mob;
		this.start = start;
		this.dest = dest;
		
		this.train = train;	
		
	}
	public PassengerEntity()
	{
		
	}

	
		
	
	
}
