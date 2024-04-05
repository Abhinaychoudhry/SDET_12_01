package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popupdemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        
        Alert at = driver.switchTo().alert();
        
        at.accept();
        
        String txt = driver.findElement(By.id("result")).getText();
        
        if (txt.equals("You clicked: Ok"))
        {
        	System.out.println("Test passed");
        }
        else
        	System.out.println("Test Failed");
        
	}

}
