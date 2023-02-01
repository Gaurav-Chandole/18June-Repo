import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/default.asp");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		Thread.sleep(1000);
		
		String mainId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		String expURL="https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst";
		String expId="";
		
		for(String s:allId)
		{
			System.out.println(s);
			driver.switchTo().window(s);
			String actURL=driver.getCurrentUrl();
			if(expURL.equals(actURL))
			{
				System.out.println("Correct Window");
			}
			else
			{
				System.out.println("Wrong Window");
			}
			
			
		}
			driver.switchTo().window(expURL);
	}
	
}
