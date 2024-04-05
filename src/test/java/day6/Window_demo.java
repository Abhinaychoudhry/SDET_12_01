package day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
 
  //Approach1 -- converting into list
  /*Set <String> ids = driver.getWindowHandles();
  
  List <String> al = new ArrayList(ids);
  
  String parentid = al.get(0);
  String childid = al.get(1);
  
  driver.switchTo().window(childid);  */
  
  //Approach 2 ----- Using for loop
  Set <String> ids = driver.getWindowHandles();
  for(String ad : ids)
  {
	  String title = driver.switchTo().window(ad).getTitle();
	  if(title.equals("Human Resources Management Software | OrangeHRM"))
	  {
		  driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		  System.out.println(driver.getTitle());
	  }
	  else if (title.equals("OrangeHRM"))
	  {
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Hello");
		  System.out.println(driver.getTitle());
	  }
	  
  }
  
  
  
  
  
  

	}

}
