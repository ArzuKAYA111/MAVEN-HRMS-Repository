package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class EmployeeReportsPageElements extends CommonMethods{

	@FindBy (id="btnAdd")
	public WebElement bntAdd;
	
	
	@FindBy (id="report_report_name")
	public WebElement reportName;
	
	@FindBy (id="report_criteria_list")
	public WebElement ddCriteria;
	
	@FindBy (id="btnAddConstraint")
	public WebElement btnAddCriteria;
	
	@FindBy (id="report_include_comparision")
	public WebElement AddCriteriaIncludeDD;
	
	@FindBy (id="employee_name_empName")
	public WebElement empName;
	
	@FindBy (id="report_display_groups")
	public WebElement ddDisplayGroups;
	
	@FindBy (id="btnAddDisplayGroup")
	public WebElement btnAddDisplayGroup;
	
	@FindBy (id="report_display_field_list")
	public WebElement displayFieldListDD;
	
	@FindBy (id="btnAddDisplayField")
	public WebElement btnAddDisplayField ;
	
	@FindBy(id="display_group_1")
	public WebElement prsnlCheckBox;
	
	@FindBy(id="display_group_2")
	public WebElement cntactDtailsCheckBox;
	
	@FindBy (id="btnSave")
	public WebElement btnSave ;
	
	@FindBy (id="search_search")
	public WebElement search;
	
	
	@FindBy (xpath="//input[@class='searchBtn']")
	public WebElement btnsearch;
	
	
	
	public EmployeeReportsPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectAndAddCriteriaDD() {
		selectDdValue(ddCriteria,"Employee Name");
		wait(5);
		jsClick(btnAddCriteria);
	}
	
	public void ddDisplayGroups() {
		selectDdValue(ddDisplayGroups,"Personal");
		wait(3);
		jsClick(btnAddDisplayGroup);
	}
	
	public void ddDisplayFieldList() {
		
		selectDdValue(displayFieldListDD,"Address");
		jsClick(btnAddDisplayField);
		selectDdValue(displayFieldListDD,"Home Telephone");
		jsClick(btnAddDisplayField);
		selectDdValue(displayFieldListDD,"Mobile");
		jsClick(btnAddDisplayField);
		selectDdValue(displayFieldListDD,"Work Email");
		jsClick(btnAddDisplayField);
		selectDdValue(displayFieldListDD,"Other Email");
		jsClick(btnAddDisplayField);
		
	}
	
	public void checkBoxClickAndSave() {
		jsClick(prsnlCheckBox);
		wait(3);
		jsClick(cntactDtailsCheckBox);
		wait(3);
		btnSave.click();
		wait(10);
	}
	
	
	
}






