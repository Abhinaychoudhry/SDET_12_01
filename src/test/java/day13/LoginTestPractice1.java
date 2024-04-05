package day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestPractice1 {
	
	WebDriver driver;
	LoginPOMpagefactory_nop ob;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(priority=1)
	void logotest() 
	{
		ob = new LoginPOMpagefactory_nop(driver);
		Assert.assertTrue(ob.checklogo());
	}
	
	@Test(priority=2)
	void logintest()
	{
		ob.setmail("abhinaychoudhary29@gmail.com");
		ob.setpassword("abhi123");
		ob.submit();
		
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}
}
