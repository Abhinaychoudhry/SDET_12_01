package day14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest_Btes {
	WebDriver driver;
	BTES_practicePOM ob;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://182.76.176.205/hrm/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority=1)
	void checklogo()
	{
		ob = new BTES_practicePOM(driver);
		Assert.assertTrue(ob.checklogo());
	}
	
	@Test(priority=2)
	void logintest()
	{
		ob.setLname("admin");
		ob.setpassword("admin");
		ob.clickbutton();
		
		Assert.assertEquals(driver.getTitle(), "BTES HRM");
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}

}
