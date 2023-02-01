import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver mulSelect= new ChromeDriver();
		Thread.sleep(1000);
		mulSelect.manage().window().maximize();
		mulSelect.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(1000);
		WebElement lan=mulSelect.findElement(By.xpath("//select[@name=\'Languages\']"));
		Select s=new Select(lan);
		Thread.sleep(1000);
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByValue("js");
		Thread.sleep(1000);
		s.selectByValue("c#");
		Thread.sleep(1000);
		
		WebElement firstSelect= s.getFirstSelectedOption();
		System.out.println(firstSelect);
		System.out.println(s.getFirstSelectedOption());
		System.out.println(firstSelect.getText());
		System.out.println(s.isMultiple());
		
		List<WebElement> lAll= s.getAllSelectedOptions();
		List<WebElement> all=s.getOptions();
		System.out.println(lAll.size());
		System.out.println(all.size());
		
		for(int i=0;i<lAll.size();i++)
		{
			System.out.println(lAll.get(i).getText());
		}
		
		s.deselectByValue("java");
		Thread.sleep(1000);
		s.deselectByIndex(1);
		Thread.sleep(1000);
		s.deselectByVisibleText("C#");
		
		
		
		
		mulSelect.quit();


		


		
		
	}
}
