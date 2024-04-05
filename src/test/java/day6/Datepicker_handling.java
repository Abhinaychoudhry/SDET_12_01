package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        driver.get("https://jqueryui.com/datepicker/");
        
        //Approach 1
        driver.switchTo().frame(0);
     //   driver.findElement( By.xpath("//*[@id=\"datepicker\"]")).sendKeys("08/15/2025");
        
        //Approach 2
    /*    driver.findElement( By.xpath("//*[@id=\"datepicker\"]")).click();  
        String year = "2025";
        String month = "June";
        String date = "15";
        
        while(true)
        {	
        String yr = driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
        String mon = driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
        
        if(year.equals(yr) && month.equals(mon))
        {
        	break;
        }
        driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        }
        
       List <WebElement> sd = driver.findElements( By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
       for(WebElement dates: sd)
       {
    	   if(dates.getText().equals(date))
    	   {
    		   dates.click();
    		   break;
    	   }
       } */
       
        driver.findElement( By.xpath("//*[@id=\"datepicker\"]")).click();  
       String year = "2019";
       String month = "December";
       String date = "15";
       while(true)
       {	
       String yr = driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
       String mon = driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
       
       if(year.equals(yr) && month.equals(mon))
       {
       	break;
       }
       driver.findElement( By.xpath("//*[@id=\\\"ui-datepicker-div\\\"]/div/a[1]/span")).click();
       }
       
      List <WebElement> sd = driver.findElements( By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
      for(WebElement dates: sd)
      {
   	   if(dates.getText().equals(date))
   	   {
   		   dates.click();
   		   break;
   	   }
      }
       
       
	}

}
