package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginPageElements extends BaseClass{

	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement orangeLogo;
	
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errMsg;
	
	@FindBy(id="forgotPasswordLink")
	public WebElement forgetPasswordBtn;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	public static void login() {
		LoginPageElements login=new LoginPageElements();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn);

	}	
}