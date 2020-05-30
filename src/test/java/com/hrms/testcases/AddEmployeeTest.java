package com.hrms.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class AddEmployeeTest extends CommonMethods{

	
	@BeforeMethod
	public void openBrowser() {
		setUp();
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	
	@Test
	public void addEmployeePage() {
		
	}
	
	
	
	
	
	
	
}
