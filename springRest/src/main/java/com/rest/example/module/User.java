package com.rest.example.module;


public class User {

	public User(long id, String country, String name) {
		super();
		this.id = id;
		this.country = country;
		this.name = name;
	}

	private long id;

	
	private String country;
	
	
	private String name;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
