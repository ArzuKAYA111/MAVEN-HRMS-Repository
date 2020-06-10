package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmplwith2D extends CommonMethods {
	
	@Test(dataProvider = "userData", groups = { "homework", "addEmp", "regression" })
		public void addEmployee(String firstName, String lastName, String username, String password) {                                                                                                                                   // System.out.println(firstName + " " + lastName + " " + username + " " + password);
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
		@DataProvider(name = "userData")
		public Object[][] getData() {
		Object[][] data = { { "Rajass", "Caporass","raj12345345ss","AmirKhan_@23ss" },
			{ "Johss", "Smthss", "john23ss", "AmirKhan_@13ss" }, { "Mayss", "Anss", "mary13ss", "Amirhan_@123ss"},
			{ "Roanssi","Sakiss", "rohai12ss3","Amirhan_@123ss" },{ "Alisss","Taraciss","ali1k23ss","AmirKhan_@13ss"},
			};
		return data;
	}
}
