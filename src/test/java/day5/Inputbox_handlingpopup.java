package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputbox_handlingpopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        
        Alert ab = driver.switchTo().alert();
        
        ab.sendKeys("I am popup");
       /* ab.accept();
        
        String txt = driver.findElement(By.id("result")).getText();
        
        if (txt.equals("You entered: I am popup"))
        {
        	System.out.println("Test passed");
        }
        else
        	System.out.println("Test Failed");   */
        
        ab.dismiss();
        String vc = driver.findElement(By.id("result")).getText();
        
        if (vc.equals("You entered: null"))
        {
        	System.out.println("Test passed");
        }
        else
        	System.out.println("Test Failed");
        


	}

}
