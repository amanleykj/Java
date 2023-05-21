package com.caresoft.clinicapp;

public class Test {

	public static void main(String[] args) {
		
		Physician careGiver1 = new Physician(5);
		User user1 = new User(3,10);
		
		user1.getPin();
		user1.getId();
		careGiver1.newPatientNotes();

	}

}
