import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		Thread.sleep(1500);

		drive.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1500);
		drive.findElement(By.xpath("//input[@placeholder=\'First name\']")).sendKeys("Swapnil");
		Thread.sleep(1000);

		drive.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("Patane");
		Thread.sleep(1000);

		drive.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("9730509898");
		Thread.sleep(1500);

		drive.findElement(By.xpath("//input[@id=\'password_step_input\']")).sendKeys("Swapnil@9730");
		Thread.sleep(1000);
		
		WebElement day=drive.findElement(By.xpath("//select[@id=\'day\']"));
		Select s=new Select(day);
		s.selectByVisibleText("4");
		Thread.sleep(1000);
		
		WebElement months=drive.findElement(By.xpath("//select[@id=\'month\']"));
		Select s1=new Select(months);
		s1.selectByValue("8");
		Thread.sleep(1000);
		
		WebElement year=drive.findElement(By.xpath("//select[@title=\'Year\']"));
		Select s2=new Select(year);
		s2.selectByValue("1994");
		Thread.sleep(1000);
		
		drive.findElement(By.xpath("//label[text()=\'Male\']")).click();
		Thread.sleep(1000);
		
		drive.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();

		drive.quit();

	}

}
