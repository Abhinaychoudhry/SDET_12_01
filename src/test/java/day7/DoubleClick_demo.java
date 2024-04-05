package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
       
       driver.switchTo().frame("iframeResult");
       
       driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
       
       driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("Abhinay");
       
       WebElement copy = driver.findElement(By.xpath("/html/body/button"));
       Actions adr = new Actions(driver);
       
       adr.doubleClick(copy).build().perform();
       
       String a = driver.findElement(By.xpath("//*[@id=\"field1\"]")).getText();
     /*  String b = driver.findElement(By.xpath("//*[@id=\"field2\"]")).getText();
       
       System.out.println(b);
       if(a.equals(b))
       {
    	   System.out.println("Text Copied Successfully");
       }
       else
    	   System.out.println("Test Failed");   */
       
       WebElement fr = driver.findElement(By.xpath("//*[@id=\\\"field2\\\"]"));
       String text = fr.getAttribute("value");
       System.out.println(text);
       if(a.equals(text))
       {
    	   System.out.println("Text Copied Successfully");
       }
       else
    	   System.out.println("Test Failed");

	}

}
