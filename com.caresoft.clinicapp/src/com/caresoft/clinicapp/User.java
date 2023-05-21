package com.caresoft.clinicapp;

public class User {
	
	protected Integer id;
	protected int pin;
	
	public User() {
		System.out.println("This is the superclass constructor.");
	}
	
	public User(int id) {
		this.id = id;
		System.out.println("This is also superclass constructor, but with id");
	}
	
	public User(Integer id, int pin) {
		this.id = id;
		this.pin = pin;
		System.out.println("This is another superclass constructor, but with id and pin");
	}
	
	public Integer getId() {
		return id;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
