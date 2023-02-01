import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(1000);
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(1000);
		
		alt.accept();
		Thread.sleep(1000);
		
		driver.quit();
		
	}
}
