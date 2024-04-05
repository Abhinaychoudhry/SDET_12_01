package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://testautomationpractice.blogspot.com/");
       JavascriptExecutor ab = driver;
       
       WebElement input = driver.findElement(By.id("name"));
       ab.executeScript("arguments[0].setAttribute('value', 'John')", input);
       
       WebElement input1 = driver.findElement(By.id("email"));
       ab.executeScript("arguments[0].setAttribute('value', 'Wick')", input1);
       
       WebElement rdm = driver.findElement(By.xpath("//input[@id='male']"));
       ab.executeScript("arguments[0].click();", rdm);
       
       WebElement cb = driver.findElement(By.xpath("//input[@id='monday']"));
       ab.executeScript("arguments[0].click();", cb);
       
//       driver.switchTo().frame("frame-one796456169");
//       WebElement sb = driver.findElement(By.xpath("//input[@id='FSsubmit']"));
//       ab.executeScript("arguments[0].click();", sb);
       
       WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
       ab.executeScript("arguments[0].click();", dd);
       
       String option = "germany";
       String az = "arguments[0].value='" +option+ "';";
       
       driver.executeScript(az, dd);
       
       String so = (String) ab.executeScript("return arguments[0].value", dd);
       System.out.println("Selected Option is: " + so);
       
	}

}
