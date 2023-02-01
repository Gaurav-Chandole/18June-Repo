import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhijit");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("Undale");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("9830509898");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id=\'password_step_input\']")).sendKeys("ajkcslic");
		Thread.sleep(1500);
		
		WebElement day=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s=new Select(day);
		s.selectByValue("4");
		Thread.sleep(1500);
	
		WebElement months=driver.findElement(By.xpath("//select[@name=\'birthday_month\']"));
		Select s1=new Select(months);
		s1.selectByVisibleText("Aug");
		Thread.sleep(1500);
		WebElement year=driver.findElement(By.xpath("//select[@name=\'birthday_year\s']"));
		Select s2=new Select(year);
		s2.selectByValue("2001");
		Thread.sleep(1500);
		
		//driver.findElement(By.xpath("//label[@for=\'u_3_5_Dp\']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		
		driver.quit();


		

		


		

		

		

		
		
		
	}



}
