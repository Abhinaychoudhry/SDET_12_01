package day6;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_practice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
  driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

  Set <String> ids = driver.getWindowHandles();
  for(String ad : ids)
  {
	  String title = driver.switchTo().window(ad).getTitle();
	  if(title.equals("Human Resources Management Software | OrangeHRM"))
	  {
		  driver.findElement( By.xpath("/html/body/footer/section/div[2]/div/div/div[3]/div/ul/li[2]/a")).click();
		 
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
