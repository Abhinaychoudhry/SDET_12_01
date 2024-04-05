package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	WebDriver driver;
	@Test(priority=1)
	@Parameters({"browser","url"})
	void setup(String br, String URL) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else
		{
		driver = new EdgeDriver();
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(5000);
		}

	@Test(priority=2)
	void testLogo()
	{
		try
		{
		boolean logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		Assert.assertEquals(logo, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}

	}
	
	@Test(priority=4)
	void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-button")).click();
	}
	
	@Test (priority=3)
	void testhomepagetitle() throws InterruptedException
	{
		String exp = "OrangeHRM";
		String act = driver.getTitle();
		
		Assert.assertEquals(exp, act, "Title does not match");
	}
	
	@Test (priority=5)
	void tearup()
	{
		driver.close();
	}
}
