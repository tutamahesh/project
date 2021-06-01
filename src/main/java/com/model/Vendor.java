package com.model;

import javax.persistence.Entity;

@Entity
public class Vendor {
	String Email;
	Integer PhoneNumber;
	String Name;
	String City;
	String Password;
	public String getEmail() {
		return Email;
	}
	public Integer getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
