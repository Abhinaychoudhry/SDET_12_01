package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twotextbox_alerthandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        
        String sd = driver.findElement(By.cssSelector("div[class='example'] p")).getText();
        
        if (sd.contains("Congratulations!"))
        {
        	System.out.println("Test passed");
        }
        else
        	System.out.println("Test Failed");
        
        driver.close();

	}

}
