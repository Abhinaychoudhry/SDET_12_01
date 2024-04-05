package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevents_RightClickdemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
       
       WebElement bt = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
       
       Actions az = new Actions(driver);
       
       az.contextClick(bt).build().perform();
       
       driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
       
       driver.switchTo().alert().accept();

	}

}
