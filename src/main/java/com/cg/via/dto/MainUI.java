package com.cg.via.dto;

import java.util.Scanner;

import com.cg.via.bean.Customer;
import com.cg.via.dao.RegistrationDao;
import com.cg.via.dao.RegistrationDaoImpl;
import com.cg.via.service.RegestrationService;
import com.cg.via.service.RegistrationServiceImpl;
import com.cg.via.service.ValidityCheckService;
import com.cg.via.service.ValidityCheckServiceImpl;
import com.cg.via.utility.AadhaarValidationException;
import com.cg.via.utility.MobileValidationException;
import com.cg.via.utility.VehicleNumberException;

public class MainUI {
	static Scanner sc = new Scanner(System.in);
	static RegestrationService rs = new RegistrationServiceImpl();
	static ValidityCheckService vs= new ValidityCheckServiceImpl();
	static RegistrationDao rd = new RegistrationDaoImpl();
	static Customer cust = new Customer();

	public static void main(String[] args) {
		
		System.out.println("Options");
		System.out.println("1.Vehicle Insurance Registration");
		System.out.println("2.Insurance Validity Check");
		System.out.println("3.Exit");
		
		int ch = sc.nextInt();
		
			
		switch (ch) {
		
		case 1:
			setInfo();
			
			
			break;
		case 2:
			validityInfo();
			
			
			break;
		case 3:
			System.out.println("Thank You");
	
			break;

		default:
			System.out.println("Enter valid input");
			
			break;
		}
	}



	

	private static int setInfo() {
		int i=0;
		
		System.out.println("Enter your Vehicle number");
		int vehicleNo=sc.nextInt();
		rs.VehicleNumberException(vehicleNo);
		if(true)
		{
			cust.setVehicleNo(sc.nextInt());
			
			System.out.println("Enter your Vehicle Type");
			cust.setVehicleType(sc.next());
		
			System.out.println("Enter your Aadhaar card number");
			long aadharNo = sc. nextLong();
			rs.AadharValidationException(aadharNo);
			if(true)
			{
				cust.setAadhaarCardNo(sc.nextLong());
				
				System.out.println("Enter your mobile number");
				int mobileNo= sc.nextInt();
				rs.MobileValidationException(mobileNo);
				if(true)
				{
					cust.setMobileNo(sc.nextInt());
					
					System.out.println("Insurance Period");
					cust.setInsurancePeriod(sc.nextInt());
					rd.registration(cust);
					i++;
				}
			
		
				else
				{
					try {
						throw new MobileValidationException();
					} catch (MobileValidationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			    }
		}
			
				else
				{
				try {
					throw new AadhaarValidationException();
				} catch (AadhaarValidationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
				}
		}
		else
		{
			try {
				throw  new VehicleNumberException();
			} catch (VehicleNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		return	i;
				
		
		
		
			
		
		
	}
private static void validityInfo() {
	
		System.out.println("Enter your vehicle number");
		int vehicleNo= sc.nextInt();
		cust.setVehicleNo(sc.nextInt());
		
		
		
		
		
	}
}


















