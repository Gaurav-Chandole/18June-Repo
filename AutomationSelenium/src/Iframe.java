import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		Thread.sleep(1500);
		
		ArrayList<String> frame= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(frame.get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title=\'Change Theme\']")).click();
		Thread.sleep(1000);
		
		WebElement tryItIframe=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(tryItIframe);
		driver.findElement(By.xpath("//button[@type=\'button\']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title=\\'Change Theme\\']")).click();
		Thread.sleep(1000);
		
		//driver.switchTo().frame(tryItIframe);
		//driver.findElement(By.xpath("//button[@type=\'button\']"));
		
		
		driver.quit();
		
		
	}
}
