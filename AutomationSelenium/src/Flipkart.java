import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'firstname\']")).sendKeys("Satish");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("Sawant");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("Sawantsatish9423@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("9028701228");
		WebElement day=driver.findElement(By.xpath("//select[@name=\'birthday_day\']"));
		Select s1=new Select(day);
		s1.selectByValue("1");
		WebElement month=driver.findElement(By.xpath("//select[@name=\'birthday_month\']"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Apr");
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.xpath("//select[@name=\'birthday_year\']"));
		Select s3=new Select(year);
		s3.selectByValue("1983");
		Thread.sleep(1000);
		WebElement l=s2.getFirstSelectedOption();
		System.out.println(l.getText());
		List<WebElement>l1=s2.getOptions();
		for(WebElement m:l1)
		{
			System.out.println(m.getText());
		}
		ArrayList<String> arr=new ArrayList<String>();
		for(WebElement m:l1)
		{
			arr.add(m.getText());
		}
		Collections.sort(arr);
		for(String s4:arr)
		{
			System.out.println(s4);
		}
		

		
		
		driver.quit();
	}
}
