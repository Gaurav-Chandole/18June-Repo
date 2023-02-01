import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSite 
{		
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();			
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		//Actions act=new Actions(driver);
		//act.click(login).perform();
		
		
		//driver.quit();
	}
}
