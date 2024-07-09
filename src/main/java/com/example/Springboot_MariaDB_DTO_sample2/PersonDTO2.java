package com.example.Springboot_MariaDB_DTO_sample2;

public class PersonDTO2 
{
	int id;
	String city;
	long pin;
	String email;
	public PersonDTO2(int id, String city, long pin, String email) {
		super();
		this.id = id;
		this.city = city;
		this.pin = pin;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
