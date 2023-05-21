package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    
    private ArrayList<String> patientNotes;
	
    public Physician (int id) {
    	super(id);
    }
    
    public boolean assignPin(int pin) {
    	if(pin > 999 && pin < 10000) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean accessAuthorized(Integer confirmedID) {
    	int userID = getId();
    	if(userID == confirmedID) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    
    
	
}
