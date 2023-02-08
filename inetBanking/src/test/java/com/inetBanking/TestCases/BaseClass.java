package com.inetBanking.TestCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilitiy.ReadConfig;
 


public class BaseClass 
{
	ReadConfig readconfig=new ReadConfig();
	String baseURL=readconfig.getApplicationURl();
	String userId=readconfig.getUserId();
	String password=readconfig.getpassword();
	public static WebDriver driver;
	//public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void LaunchBrowser(String br) throws InterruptedException        
	{
		if(br.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				readconfig.getChromeDriverPath());
//				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();

		}
		else if(br.equalsIgnoreCase("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFireFoxBrowserPath());
			driver=new FirefoxDriver();
		}
		driver.get(baseURL);

		Thread.sleep(1000);
		//driver.get(baseURL); 
		//logger=Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
