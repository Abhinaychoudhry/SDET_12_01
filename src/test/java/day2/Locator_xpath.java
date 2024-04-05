package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
   driver.get("https://demo.nopcommerce.com/");
		  
  // absolute path
 //  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[1]/a")).click();
   
   //relative path
   driver.findElement(By.xpath("//a[normalize-space()='Apple MacBook Pro 13-inch']")).click();
   
   

	}

}
