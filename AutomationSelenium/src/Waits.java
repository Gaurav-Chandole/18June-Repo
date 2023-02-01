import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/default.asp");
		Thread.sleep(1500);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebDriverWait expl=new WebDriverWait(driver, 10); version 3.14
		
		
		//Explicate Waits
		WebDriverWait expl= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ele= expl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='te']")));
		System.out.println("Start");
	}
}
