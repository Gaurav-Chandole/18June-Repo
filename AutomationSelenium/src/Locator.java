import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("gaufrav@gmai.com");
		Thread.sleep(3000);

		driver.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(3000);

		driver.findElement(By.name("login")).click();

		
		
	}

}
