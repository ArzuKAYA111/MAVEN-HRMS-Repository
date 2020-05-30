package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;


public class LoginTest extends CommonMethods {
	
@Test(groups="smoke")
public void ValidAdminlogin() {
	
//LoginPageElements login=new LoginPageElements();
sendText(login.username, ConfigsReader.getProperty("username"));
sendText(login.password, ConfigsReader.getProperty("password"));
click(login.loginBtn) ;

//DashBoardPageElements dashboard=new DashBoardPageElements();
String expextedUser="Welcome Admin";
String actualUser=dashboard.welcome.getText();
Assert.assertEquals(actualUser, expextedUser, "Admin is NOT Logged in");

}

@Test(groups ="regression")
public void InvalidPasswordlogin() {

	//LoginPageElements login=new LoginPageElements();
	sendText(login.username, ConfigsReader.getProperty("username"));
	sendText(login.password, "uiuguig");
	click(login.loginBtn) ;	
	String expected = "Invalid credentials";
	Assert.assertEquals(login.errorMsg.getText(), expected,"Error message text is not match");
}

@Test(enabled=true)
public void emptyUsernamelogin() {

//	LoginPageElements login=new LoginPageElements();
	//sendText(login.username, ConfigsReader.getProperty("username")); // common out to make empty user name
	sendText(login.password, ConfigsReader.getProperty("password"));
	click(login.loginBtn) ;	
	String expected = "Username cannot be empty";
	Assert.assertEquals(login.errorMsg.getText(), expected,"Error message text is not match");
}







}
