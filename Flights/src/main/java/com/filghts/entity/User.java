package com.filghts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User extends AbstractEntity {
	
	
 
	@Column(name="firstname")
 private String firstName;
 private String lastName;
 //@Column(name="EmailId", nullable = false)
 private String email;
 private String password;
   
 public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User( String firstName, String lastName, String email, String password) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
}

@Override
public String toString() {
	return "User [ firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
			+ password + "]";
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
 
}

