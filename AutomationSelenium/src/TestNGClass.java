import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass 
{
 @BeforeClass
 public void beforeClass()
 {
	 System.out.println("BeforeClass");
 }
 
 @BeforeMethod
 public void beforeMethod()
 {
	 System.out.println("BeforeMethod");
 }
 
 @Test
 public void test123()
 {
	 System.out.println("Test");
 }
}
