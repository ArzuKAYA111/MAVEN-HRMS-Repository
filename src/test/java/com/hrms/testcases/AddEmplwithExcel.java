package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class AddEmplwithExcel extends CommonMethods {

	
		@Test(dataProvider ="userDataFromExcel", groups = { "homework", "addEmp", "regression" })
		public void addEmployee(String firstName, String lastName, String middlename ,String username, String password) {                                                                                                                                   // System.out.println(firstName + " " + lastName + " " + username + " " + password);
			// login into HRMS
			login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
	// navigate to Add Employee page
			dashboard.navigateToAddEmployee();
			wait(1);
	// add employee information
			sendText(addEmp.empfirstnme, firstName);
			sendText(addEmp.lastnme, lastName);
	// get EmployeeID
			String expectedEmpId = addEmp.empid.getAttribute("value");
	// click on Create Login Details
			click(addEmp.loginDetls);
			wait(1);
			sendText(addEmp.username, username);
			sendText(addEmp.midlname, middlename);
			sendText(addEmp.userpassword, password);
			sendText(addEmp.reuserpassword, password);
			wait(1);
			jsClick(addEmp.BtnSave);
		wait(2);
	// validation
			waitForVisibilityOfElemet(pdetails.lblPersonalDetails);
			String actualEmpId =pdetails.employeeId.getAttribute("value");
			Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");
	// take screenshot
			takeScreenshot(firstName + "_" + lastName);
	}
		@DataProvider(name ="userDataFromExcel")
		public Object[][] getData2() {
			return ExcelUtility.excelIntoArray(Constants.TESTDATA_FILEPATH, "Sheet1");
		}}
