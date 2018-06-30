package com.MavenWebMail.webMailTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest 
  {
	App appObject =new App();
	
	@Test
	public void enterCredentialsTest()
	{
		appObject.enterCredentials();
	}
	@Test
	public void selectMessageTest() throws Exception
	{
		appObject.newMail();
	}
	
	
	@BeforeClass
	public void launchTest()
	{
		appObject.launchBrowser();
	}
	
	@AfterClass
	public void closeTest()
	{
		//appObject.closeBrowser();
	}
	
	
       }
