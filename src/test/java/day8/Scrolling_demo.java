package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://testautomationpractice.blogspot.com/");

       JavascriptExecutor ab = driver;
       
       ab.executeScript("window.scrollBy(0,300)" , "");
       System.out.println(ab.executeScript("return window.pageYOffset;", ""));
       
       WebElement India = driver.findElement(By.xpath("//label[@for='country']"));
       ab.executeScript("arguments[0].scrollIntoView", India);  //scroll to specific area
       
       ab.executeScript("window.scrollBy(0,document.body.scrollHeight", ""); //scroll to end of page
       
       ab.executeScript("window.scrollBy(0,-document.body.scrollHeight", "");  //scroll to top
       
	}

}
