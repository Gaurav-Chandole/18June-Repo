import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiList 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\'Create New Account\']")).click();
		Thread.sleep(1000);

		
		WebElement months=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s= new Select(months);
		List <WebElement>list=s.getOptions();
		
		ArrayList<String> ar=new ArrayList<String>();
		
		for(WebElement w:list)
		{
			String str=w.getText();
			ar.add(str);
			
		}
		Collections.sort(ar);
		for(String s1:ar)
		{
			System.out.println(s1);
		}
		
		
		
		
	}
}
