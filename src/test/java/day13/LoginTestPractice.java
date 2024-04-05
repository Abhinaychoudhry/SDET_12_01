package day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestPractice {
	
	WebDriver driver;
	LoginPOM_mercury ab;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority=1)
	void checklogo()
	{
		ab= new LoginPOM_mercury(driver);
		Assert.assertTrue(ab.checklogo());
	}
	
	@Test(priority=2)
	void testlogin()
	{
		ab.Uname("abhi123");
		ab.pwd("abhinay");
		ab.submit();
		
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}

}
