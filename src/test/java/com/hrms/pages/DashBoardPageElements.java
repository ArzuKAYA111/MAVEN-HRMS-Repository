package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods {// To create useable methods in that class
															// and to use commen methods and everything we extend it
															// from CommenMethods

	@FindBy(id ="welcome")
	public WebElement welcome;

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo; // logo in Dashboard at the left top

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addemp;

	@FindBy(id = "firstName")
	public WebElement empfirstnme;

	@FindBy(id = "lastName")
	public WebElement lastnme;

	@FindBy(id = "employeeId")
	public WebElement empid;

	@FindBy(id = "//input[@id='personal_txtEmployeeId']")
	public WebElement lablempid;

	@FindBy(id = "photofile")
	public WebElement empPrfl;

	@FindBy(id = "btnSave")
	public WebElement BtnSave;
	
	@FindBy (id="menu_core_viewDefinedPredefinedReports")
	public WebElement reports;
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addemp); //  We created method to click elements what defind in that class so we willl calll taha method in Test
	
	}
	public void navigateToREport() {
		jsClick(PIM);
		jsClick(reports); //  We created method to click elements what defind in that class so we willl calll taha method in Test
	
	}
}