package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	    
    public AdminUser(int id, String role) {
    	super(id);
    	securityIncidents = new ArrayList<>();
    	
    }
    private String role;
    private ArrayList<String> securityIncidents;
    private Integer employeeID;
       
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
	public Integer getEmployeeID() {
		return employeeID;
	}

	public String getRole() {
		return role;
	}
	
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}


	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedID) {
		if(this.id == confirmedID) {
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}
	
	@Override
	public boolean assignPin(int pin) {
		return false;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return null;
	}


}
