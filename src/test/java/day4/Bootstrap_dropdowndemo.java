package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdowndemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        
        driver.findElement( By.xpath("//b[@class='caret']")).click();
        
        List <WebElement> ab  = driver.findElements( By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
        
   //     System.out.println("Total Number of options are: " + ab.size());
        
 //       for(WebElement as: ab)
//		{
  //      	 System.out.println(as.getText());
//		}  
        
    //    for(int i=0;i<ab.size();i++)
     //   {
    //    	System.out.println(ab.get(i).getText());
    //    }

    /*    for(int i=0;i<ab.size();i++)
               {
               	if(ab.get(i).getText().equals("Java")) {
               	ab.get(i).click();
               	break;
               	}
              }*/
        
        for(int i=0;i<ab.size();i++)
        {
        	String option = ab.get(i).getText();
        	if(option.equals("Java") || option.equals("Python"))
        	{
        		ab.get(i).click();
               	break;
        	}
        }
        
	}

}
