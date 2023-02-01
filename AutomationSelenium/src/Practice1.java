import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice1 
{
	public static void main (String [] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		/*File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("H:\\velocity_Testing\\test.jpg");
		
		FileHandler.copy(source, dest);*/
		
		 List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\'customers\']//tr"));
		 //System.out.println(rows.size());

		List <WebElement>headeCell=driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		 //System.out.println(headrcell.size());

		List <WebElement>remeningCell=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));

		
		
	}
}