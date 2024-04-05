package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardkeys_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
       driver.get("https://the-internet.herokuapp.com/key_presses");
       
  //     driver.findElement(By.xpath("//input[@id='target']")).sendKeys("a");
       
       Actions ac = new Actions(driver);
       ac.sendKeys(Keys.TAB).perform();
  
     String zz= driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
      
     
     if (zz.equals("You entered: TAB"))
     {
    	 System.out.println("Pass");
     }
     else
     {
    	 System.out.println("Fail");
     }

	}

}
