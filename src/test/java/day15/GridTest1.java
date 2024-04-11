package day15;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest1 {
	
	WebDriver driver;
	@Test
	void setup() throws MalformedURLException
	{
		String url = "http://192.168.209.108:4444";
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setBrowserName("chrome");
		cp.setPlatform(Platform.WINDOWS);
		URL ur = new URL(url);
		
		driver = new RemoteWebDriver(ur,cp);
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
	}

}
