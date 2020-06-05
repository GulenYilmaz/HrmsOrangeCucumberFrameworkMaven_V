package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ViewEmployeePageElements  extends CommonMethods{
    //login page elements
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(name = "txtPassword")
	public WebElement password;

	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLogo']/img")
	public WebElement logo;

	@FindBy(id = "spanMessage")
	public WebElement errorMsg;

	
	
	//dashboard page elements
	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	
	
	
	//viewEmployeepageElement
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr/td[2]")
    public WebElement empIDValidation;
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr")
    public WebElement empList;
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr/td[3]/a")
    public WebElement empNameValidation;
    
	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}