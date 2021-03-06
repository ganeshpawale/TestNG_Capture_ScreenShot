import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 
public class Test_Base {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://gmail.com");
			driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
			
		}
	}
	
	@AfterSuite
	public void Down()
	{
		driver.quit();
	}
	
	
}
