package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class LoginPageTestCase01 extends BaseClass
{
	@Test
	public void LoginTest() throws InterruptedException
	{
		Thread.sleep(1000);
		//logger.info("URL is opened");
		LoginPage page=new LoginPage(driver);
		page.EnterUserId(userId);
		Thread.sleep(1000);

		//logger.info("Enter UssrID");
		page.EnterPassword(password);
		Thread.sleep(1000);

		//logger.info("Enter Password");
		page.ClickLoginButton();
		Thread.sleep(1000);

		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			//logger.info("Test is passed");
		}
		else
		{
			Assert.assertTrue(false);
			//logger.info("Test is failed");
		}
	}
}
