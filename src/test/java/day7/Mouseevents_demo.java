package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevents_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://demo.opencart.com/");
       
   //    WebElement desk = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
       
  //     WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
       
       WebElement lap = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
       WebElement win = driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
       
       Actions act = new Actions(driver);
       
   //    act.moveToElement(desk).moveToElement(mac).click().build().perform();
       act.moveToElement(lap).moveToElement(win).click().build().perform();

	}

}
