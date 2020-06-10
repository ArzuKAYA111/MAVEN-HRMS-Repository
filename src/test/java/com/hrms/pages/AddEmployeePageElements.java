package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods{
	@FindBy(id="firstName")
	public WebElement empfirstnme;
	
	@FindBy(id="middleName")
	public WebElement midlname;
	
	@FindBy(id="lastName")
	public WebElement lastnme;
	
	@FindBy(id="employeeId")
	public WebElement empid;
	
	@FindBy (id="photofile")
	public WebElement chooseFile;
	
	@FindBy(id="chkLogin")
	public WebElement loginDetls;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement userpassword;
	
	@FindBy(id="re_password")
	public WebElement reuserpassword;
	
	@FindBy(xpath="//span[text()='Passwords do not match']")
	public WebElement passwordErrmsg; 
	
	@FindBy(id="btnSave")
	public WebElement BtnSave;
	
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
