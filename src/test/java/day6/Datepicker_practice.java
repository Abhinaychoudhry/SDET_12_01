package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Datepicker_practice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
    
        driver.findElement( By.xpath("//input[@id='product_3186']")).click(); 
        driver.findElement( By.name("travname")).sendKeys("Abhinay");
        driver.findElement( By.name("travlastname")).sendKeys("Choudhary");
        driver.findElement( By.name("order_comments")).sendKeys("Please send parcel on business address");
        
    //    driver.findElement( By.xpath("//input[@id='dob']")).sendKeys("1/8/1995");
        
        driver.findElement( By.xpath("//input[@id='dob']")).click();
        String date = "1";
        
        WebElement year = driver.findElement( By.xpath("//select[@aria-label='Select year']"));
        Select drp = new Select(year);
        drp.selectByVisibleText("1995");
        
        WebElement month = driver.findElement( By.xpath("//select[@aria-label='Select month']"));
        Select uio = new Select(month);
        uio.selectByVisibleText("Aug");
        
        List <WebElement> sd = driver.findElements( By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
        for(WebElement dates: sd)
        {
     	   if(dates.getText().equals(date))
     	   {
     		   dates.click();
     		   break;
     	   }
        }
        
        driver.findElement( By.xpath("//input[@id='sex_1']")).click();
        driver.findElement( By.name("fromcity")).sendKeys("Chandigarh");
        driver.findElement( By.name("tocity")).sendKeys("Kullu");
        
        driver.findElement( By.xpath("//input[@id='departon']")).click();
        
        WebElement yrr = driver.findElement( By.xpath("//select[@aria-label='Select year']"));
        Select qw = new Select(yrr);
        qw.selectByVisibleText("2025");
        
        WebElement mont = driver.findElement( By.xpath("//select[@aria-label='Select month']"));
        Select as = new Select(mont);
        as.selectByVisibleText("Mar");
        
        WebElement mn = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        System.out.println("Before Sliding Min" + mn.getLocation());
        Actions act = new Actions(driver);
  //      act.dragAndDropBy(mn, 100, 0).build().perform();
   //     System.out.println("After Sliding Min:" + mn.getLocation());
        
        String dat = "16";
        List <WebElement> zx = driver.findElements( By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
        for(WebElement dates: zx)
        {
     	   if(dates.getText().equals(dat))
     	   {
     		   dates.click();
     		   break;
     	   }
        }
        
        driver.findElement( By.name("notes")).sendKeys("Booking Tickets");
       
	}

}
