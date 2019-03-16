package com.cg.via.service;

import com.cg.via.bean.Customer;

public interface RegestrationService {
	
	int setInfo();
	
	 String registration(Customer customer);

	boolean VehicleNumberException(int vehicleNo);

	boolean AadharValidationException(long aadharNo);

	boolean MobileValidationException(int mobileNo);
	
	
	

}
