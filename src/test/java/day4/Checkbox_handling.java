package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Selecting one element
    //    driver.findElement(By.id("monday")).click();
        
       

        //finding no. of checkboxes
        List <WebElement> cb =  driver.findElements( By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
        
  //      int size = cb.size();
	//	System.out.println("Number of check boxes are –  " + size);
		
		//Selecting all checkboxes
	/*	for(int i=0;i<cb.size();i++)
		{
			cb.get(i).click();
		}

		// or
		 
		for(WebElement chk: cb)
		{
			chk.click();
		}  */
		
		/* selecting first two
		for (int i=0;i<2;i++)
		{
			cb.get(i).click();
		}*/
		
		//Uncheck or clear all checkboxes
		
	/*	for(WebElement chk: cb)
		{
			chk.click();
		}  
		
		Thread.sleep(4000);
		
		for(WebElement chk: cb)
		{
			chk.click();
		}  */
		
		
		//selecting & unselecting first 3 checkboxes
		
		for (int i=0;i<3;i++)
		{
			cb.get(i).click();
		}
		
		Thread.sleep(3000);
		
		for (int i=0;i<3;i++)
		{
			cb.get(i).click();
		}
		
	}

}
