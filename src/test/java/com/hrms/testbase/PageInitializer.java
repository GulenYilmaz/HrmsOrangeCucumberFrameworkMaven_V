package com.hrms.testbase;


import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.pages.AddEmployeePageElements;
//initializes all pages class and stores references in static varibales
//that will called/used in test classes


public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dBoard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements pDetails;
	
	public static void initializeAllPages() {
		login=new LoginPageElements();
		dBoard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pDetails=new PersonalDetailsPageElements();
	}
}