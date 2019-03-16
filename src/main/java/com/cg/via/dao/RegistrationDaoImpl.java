package com.cg.via.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.via.bean.Customer;

public class RegistrationDaoImpl implements RegistrationDao{
	Map<Integer,Customer> customerEntry;
	

	public String registration(Customer customer) {
		
		customerEntry = new HashMap<Integer, Customer>();
		
	
		
		
		return null;
	}

	public boolean VehicleNumberException(int vehicleNo) {
		
		if(true)
	
		return true;
		else
		return false;
	}

	public boolean AadharValidationException(long aadharNo) {
		
		return true;
	}

	public boolean MobileValidationException(int mobileNo) {
		
		return true;
	}

	

}
