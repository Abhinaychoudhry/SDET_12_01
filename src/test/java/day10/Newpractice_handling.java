package day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newpractice_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://blazedemo.com/");
       
       driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).click();
       WebElement dd = driver.findElement( By.xpath("/html/body/div[3]/form/select[1]"));
       Select drp = new Select(dd);
       drp.selectByVisibleText("San Diego");
       
       driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")).click();
       WebElement dd1 = driver.findElement( By.xpath("/html/body/div[3]/form/select[2]"));
       Select drp1 = new Select(dd1);
       drp1.selectByVisibleText("New York");
       
       driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
       
       int row = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr")).size();
       System.out.println("Number of rows:" + row);
       int col = driver.findElements(By.xpath("/html/body/div[2]/table/thead/tr/th")).size();
       System.out.println("Number of columns:" + col);
       
      
       for(int r=1;r<row;r++)
       {
      String pricestring = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr["+r+"]/td[6]")).getText();
     
      double number = Double.parseDouble(pricestring); 
      
     Double[] strArray = null; 
     
     for (int i = 0; i< strArray.length; i++)
     {  
    	 System.out.println(strArray[i]);  
     }  
     
     
     
       }


	}

}
