import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLocator 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("gauravchandole@yahoo.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("signin")).click();
		Thread.sleep(3000);


		driver.findElement(By.name("password")).sendKeys("9028701228");
		Thread.sleep(3000);
		
		driver.findElement(By.name("verifyPassword")).click();


		
		
	}
}
