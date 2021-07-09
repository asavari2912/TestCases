package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest{
	
@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		Assert.fail("Login test failed");
	
		
	}
	
	
	
	/*		@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(String username, String password){
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(username, password);
		//Assert.fail("Login test failed");
	
		
	}*/

}
