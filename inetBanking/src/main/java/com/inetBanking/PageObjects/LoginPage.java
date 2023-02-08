package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	private WebElement UserId;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement Password;
	
	@FindBy (name="btnLogin")
	@CacheLookup
	private WebElement ClickButton;
	
	
	public void EnterUserId(String id)
	{
		UserId.sendKeys(id);
	}
	public void EnterPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickLoginButton()
	{
		ClickButton.click();
	}
}
