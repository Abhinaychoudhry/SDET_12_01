package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
 //       System.out.println("Page Source is: " + driver.getPageSource());
        
  //      String a = driver.getWindowHandle();
  //      System.out.println("Window ID is: " + a);
       Thread.sleep(4000); 
      driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
      
      Set <String> windowid = driver.getWindowHandles();
      for (String x:windowid)
      {
    	  System.out.println("Window IDs are: " + x);
      }

	}

}
