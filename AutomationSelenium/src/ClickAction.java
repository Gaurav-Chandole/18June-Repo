


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(1500);
		
		WebElement changeLanguage= driver.findElement(By.xpath("//a[@aria-label=\'Choose a language for shopping.\']"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		/*act.moveToElement(changeLanguage).perform();
		Thread.sleep(1500);
		
		act.contextClick(changeLanguage).perform();
		Thread.sleep(1500);
		
		act.click(changeLanguage).perform();
		Thread.sleep(1500);*/

		act.click(changeLanguage).click().build().perform();
		Thread.sleep(1500);



		//act.click(changeLanguage);
		//Thread.sleep(1500);
		
		driver.quit();
	}
}
