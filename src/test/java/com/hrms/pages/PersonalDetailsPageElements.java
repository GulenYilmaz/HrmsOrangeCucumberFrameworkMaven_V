package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements extends BaseClass{

	@FindBy(id="personal_txtEmpFirstName")
	public WebElement firstName;
	
	
	@FindBy(id="personal_txtEmpMiddleName")
	public WebElement middleName;
	
	
	@FindBy(id="personal_txtEmpLastName")
	public WebElement lastName;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement empId;	
	
	@FindBy(xpath="//div[@id='profile-pic']/div/a/img")
	public WebElement empPicture;
	
	@FindBy(id="user_name")
	public WebElement nameOnEmpPicture;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PimBtn;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmpBtn;
	

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}