package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        
        driver.switchTo().alert().accept();
        
     String txt = driver.findElement(By.id("result")).getText();
        
        if (txt.equals("You successfully clicked an alert"))
        {
        	System.out.println("Test passed");
        }
        else
        	System.out.println("Test Failed");

	}

}
