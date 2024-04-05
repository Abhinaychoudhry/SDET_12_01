package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	 ChromeDriver driver;
  @Test(priority=1)
  public void openapp()
  {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
  }
  @Test(priority=2)
  public void login()
  {
	  driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
  }
  @Test(priority=3)
  public void closeapp()
  {
	 driver.close(); 
  }
  
}
