import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesFetch {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		List <WebElement> rowCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		List <WebElement> headerCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr/th"));
		List <WebElement> remaningCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr/td"));


		System.out.println(headerCount.size()+remaningCount.size());
		
		for(int i=1;i<=rowCount.size();i++)
		{
			List<WebElement>row_Cell;
			if(i==1)
			{
				row_Cell=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr["+i+"]/th"));
			}
			else
			{
				row_Cell=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr["+i+"]/td"));
			}
			for(int j=1;j<=row_Cell.size();j++)
			{
				System.out.println(row_Cell.get(j).getText()+"    ");
			}
			System.out.println();
		}
	
			
		//driver.quit();

	}

}
