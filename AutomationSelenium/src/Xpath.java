import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("gauravchandole@yahoo.com");
		Thread.sleep(2000);

		drive.findElement(By.xpath("//input[@type='password']")).sendKeys("Gaurav@902870");
		Thread.sleep(2000);
		
		//drive.findElement(By.xpath("//button[@id='loginbutton']")).click();
		//Thread.sleep(2000);
		
		drive.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		

	}

}
