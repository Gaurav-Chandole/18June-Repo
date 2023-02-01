import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	static void Screen()
	{
		//File sources= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File Dest= new File("H:\\velocity_Testing\\AutomationSelenium\\D2.jpg");
		
		//FileHandler.copy(sources, Dest);
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		
		File sources= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File Dest= new File("H:\\velocity_Testing\\AutomationSelenium\\D2.jpg");
		
		FileHandler.copy(sources, Dest);
	}
}
