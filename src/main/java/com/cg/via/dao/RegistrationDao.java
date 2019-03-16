package com.cg.via.dao;

import com.cg.via.bean.Customer;

public interface RegistrationDao {
	
	 String registration(Customer customer);
	 	boolean VehicleNumberException(int vehicleNo);

		boolean AadharValidationException(long aadharNo);

		boolean MobileValidationException(int mobileNo);
	 
	
	

}
