package day15;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridTest2 {

	WebDriver driver;
	@BeforeClass
	void setup() throws MalformedURLException
	{
		String url = "http://192.168.209.108:4444";
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setBrowserName("chrome");
		cp.setPlatform(Platform.WINDOWS);
		URL ur = new URL(url);
		
		driver = new RemoteWebDriver(ur,cp);
	}
	
	@Test
	void login()
	{
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("abhinaychoudhary29@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testabhi@123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		String text = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
		
		Assert.assertEquals(true, text.contains("abhinay"));
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}
}
