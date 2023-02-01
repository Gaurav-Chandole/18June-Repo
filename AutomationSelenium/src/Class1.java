
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"H:\\velocity_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		Thread.sleep(4000);
		
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		
		Dimension D1=new Dimension(100,4000);
		driver.manage().window().setSize(D1);
		Thread.sleep(4000);

		Point p=new Point(400,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		//String url=driver.getCurrentUrl();
		//String title=driver.getTitle();
		//System.out.println("Current URL is: "+url+" Current URL title is:"+title);
		//driver.manage().window().hashCode();
		
		Navigation nv=driver.navigate();
		nv.back();// navigate Backword;
		
		nv.forward();
		Thread.sleep(2000);
		
		nv.refresh();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}

}
