package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_new {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        
        driver.findElement(By.xpath("//label[@for='gender-male']")).click();
        
       driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhinay");
       driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Choudhary");
       
       driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhinaychoudhary29@gmail.com");
       driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Vajson India");
       
       driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("qwerty123");
       driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("qwerty123");
       
       
       driver.findElement(By.xpath("//button[@id='register-button']")).click();
       

	}

}
