package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_practice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello!");
        
        driver.switchTo().frame("frm2");
        
        driver.findElement(By.id("firstName")).sendKeys("Abhinay");
        driver.findElement(By.id("lastName")).sendKeys("Choudhary");
        
        driver.findElement(By.id("malerb")).click();
        
        List <WebElement> check =  driver.findElements( By.xpath("//*[@class=\"bcCheckBox\"][@type=\"checkbox\"]"));
        for (int i=0;i<2;i++)
		{
			check.get(i).click();
		}
        
        driver.findElement(By.id("email")).sendKeys("abhinaychoudhary29@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("--1st frame");
        
        //FRAME 3
        driver.switchTo().frame("frm3");
        
        driver.findElement(By.id("name")).sendKeys("What is up?");
       
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("--Both Frames visited");
	}

}
