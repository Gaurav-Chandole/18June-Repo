//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//a[@data-testid=\'sign-up-link\']")).click();
		//Thread.sleep(1500);
		
		//driver.quit();
	}

}
