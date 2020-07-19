package com.rest.demoapp.entity;

import org.springframework.data.annotation.Id;

public class Person {

	@Id
	private String Id;
	private String FirstName;
	private String LastName;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	

}
