package com.hrms.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class EmployeeReportsTest extends CommonMethods{

	
		
		//@Test (dataProvider=“DataFromExcel”, groups = {“homework”,“empReport”,“report”})
//		public void empReport(String reportName, String employeeName )
		@Test (groups = {"homework","empReport","report"})
		public void empReport() {
			// test.info("Entering valid admin credantials to login HRMS and navigate to dashboared page");

			login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
			//test.info(“Entering valid admin credentials to login HRMS”); // while u are running as testNg it will give error.
			dashboard.navigateToREport(); // this method click to PIM and EmpList
			
			wait(2);
			
			empReports.bntAdd.click();
			wait(5);
			
		//	sendText(empReports.reportName, reportName);
			sendText(empReports.reportName, "arzu");
			wait(2);
			
			empReports.ddCriteria.click();
			empReports.selectAndAddCriteriaDD();
			wait(3);
			
			selectDdValue( empReports.AddCriteriaIncludeDD, "Current Employees Only");
			wait(2);
			
			//sendText(empReports.empName, employeeName);
			empReports.empName.sendKeys("Charlotte William Brown",Keys.ENTER);
			empReports.ddDisplayGroups();
			wait(5);
			
			empReports.ddDisplayFieldList();
			wait(5);
			
			empReports.checkBoxClickAndSave();
			wait(5);
			
			//sendText(empReports.search,reportName);
			sendText(empReports.search,"arzuAndPaty");
			jsClick(empReports.btnsearch);
			wait(5);
			
			takeScreenshot("empReport");
			
			getTimeStemp();
			
		}
		
		
//		@DataProvider(name=“DataFromExcel”)
//		public Object [][]getData(){
//			return ExcelUtility.excelIntoArray(Constants.TESTDATA_FILEPATH, “addReport”);
//		}
	}
		