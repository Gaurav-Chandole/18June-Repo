import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\'Create New Account\']")).click();
		Thread.sleep(1500);
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByValue("8");
		Thread.sleep(1500);
		s1.selectByValue("9");
		Thread.sleep(1500);
		s1.selectByValue("1");
		Thread.sleep(1500);
		
		WebElement l=s1.getFirstSelectedOption();
		System.out.println(l.getText());

		System.out.println("############");
		List<WebElement> l1=s1.getAllSelectedOptions();
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
		}
		
		System.out.println("############");
		List<WebElement> l2=s1.getOptions();
		for(WebElement w:l2)
		{
			System.out.println(w.getText());
		}
		ArrayList<String> arr=new ArrayList<String>();
		System.out.println("#############");
		for(WebElement w:l2)
		{
			arr.add(w.getText());
		}
		Collections.sort(arr);
		System.out.println("#############");
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
