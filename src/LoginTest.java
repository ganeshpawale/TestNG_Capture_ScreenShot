import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Test_Base{

	@Test(priority=1)
	public void doLogin()
	{
	
		driver.findElement(By.id("Email")).sendKeys("selweb55@gmail.com");
		driver.findElement(By.id("nxt")).click();
		
		//driver.findElement(By.id(""))
	}
	
	/*@Test(priority=2)
	public void composeEmail()
	{
		Assert.fail("Error is composing email");
	}*/
}
 