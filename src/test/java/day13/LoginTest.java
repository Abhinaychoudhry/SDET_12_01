package day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPOM_demo lp;
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
	}

	@Test(priority=2)
	void testlogin()
	{
		lp.setusername("Admin");
		lp.setpasswordname("admin123");
		lp.loginclick();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=1)
	void logocheck()
	{
		 lp = new LoginPOM_demo(driver);
        Assert.assertTrue(lp.checklogo());
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}
}
