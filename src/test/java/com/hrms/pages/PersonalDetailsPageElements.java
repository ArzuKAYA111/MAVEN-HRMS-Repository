package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {
	
	
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement firstname;
	
	@FindBy(id= "personal_txtEmpLastName")
	public WebElement lasstname;
	
	@FindBy(id ="personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(name ="personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	@FindBy(xpath ="//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;
	
	@FindBy(id ="personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(id ="personal_cmbNation")
	public WebElement nationality;   
	
	@FindBy(id ="btnSave")
	public WebElement Edit;
	
	@FindBy(id ="btnSave")
	public WebElement save;

	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	public WebElement report;
	@FindBy(id="personal_DOB")
	public WebElement birthDate;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	
	
	
	}
}