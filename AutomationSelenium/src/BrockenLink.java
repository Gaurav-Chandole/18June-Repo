import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLink 
{
	@SuppressWarnings("deprecation")
	public static void main(String [] args) throws InterruptedException, IOException  
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(15000);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			String url = element.getAttribute("href");
			URL link= new URL(url);
			HttpURLConnection httpConn= (HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			httpConn.connect();
			int rescode=httpConn.getResponseCode();
			if(rescode>=400)
			{
					System.out.println(url+"  "+"is Brocken link  ");
			}
			else 
			{
					System.out.println(url+"  "+" is Valid Link");  
			}
		}
		
		
		
		
		
		
	}
}
