package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locator_demo3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
    //    WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        Thread.sleep(5000);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
         
     
         
    //     driver.findElement(RelativeLocator.with(By.tagName("input")).below(username)).sendKeys("Hello");
         
         driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Hello");
         
	}

}
