package com.cg.via.service;

import com.cg.via.bean.Customer;
import com.cg.via.dto.MainUI;

public class RegistrationServiceImpl implements RegestrationService {
	Customer cust = new Customer();
	MainUI main = new MainUI();

	public int setInfo() {
		
		
		return 0;
	}

	public String registration(Customer customer) {
		
		return null;
	}

	public boolean VehicleNumberException(int vehicleNo) {
		
		if(vehicleNo==4)
			return true;
		else
			return false;
	
	}

	

	public boolean AadharValidationException(long aadharNo) {
		
		if(aadharNo==12)
			return true;
		else
			return false;
	}

	public boolean MobileValidationException(int mobileNo) {
		
		if(mobileNo==10)
			return true;
		else
			return false;
	}

}
