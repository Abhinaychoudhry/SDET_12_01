package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");
       
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[2]/i")).click(); 
     
       List <WebElement> mn = driver.findElements(By.xpath("//*[@role=\"option\"]/span"));
       System.out.println("Size of the List is: " + mn.size());
       
       System.out.println("Elements of the List are: ");
       for(int i=0;i<mn.size();i++)
       {
    	   System.out.println(mn.get(i).getText());
       }
       
       
	}

}
