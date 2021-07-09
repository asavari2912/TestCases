package com.w2a.testcases;

import org.testng.annotations.AfterSuite;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		// Page is a classname and quite() is static method which we are calling using classname i.e Page
		//Page.quit();
	
		
		
	}

}
