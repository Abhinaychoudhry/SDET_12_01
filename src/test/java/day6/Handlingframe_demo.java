package day6;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingframe_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  driver.get("https://testautomationpractice.blogspot.com/");
  
  driver.findElement(By.id("name")).sendKeys("Abhinay");
  driver.findElement(By.id("email")).sendKeys("abhinaychoudhary29@gmail.com");
  driver.findElement(By.id("phone")).sendKeys("985632574");
  driver.findElement(By.id("textarea")).sendKeys("#2001,Chandigarh");
  driver.findElement(By.id("male")).click();
  
  List <WebElement> days=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
  for(int i=0;i<2;i++)
  {
	  days.get(i).click();
  }
  
  WebElement country = driver.findElement( By.xpath("//*[@id=\"country\"]"));
  Select one = new Select(country);
  
  one.selectByVisibleText("India");
  
  List <WebElement> color = driver.findElements(By.xpath("//*[@class=\"form-control\"][@id=\"colors\"]/child::*"));
  for(int i=0;i<color.size();i++)
  {
	  String option = color.get(i).getText();
  	if(option.equals("Green") || option.equals("White"))
  	{
  		color.get(i).click();
         	break; 
    }
   }
  
  driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[1]")).click();
  driver.navigate().back();
  
  driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
  driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
  
  
  List <WebElement> search = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/child::*"));
 for(int i=0;i<search.size();i++)
   {
	 if(search.get(i).getText().equals("Selenium")) 
	 {
        	search.get(i).click();
        	break;
     }
   }
 
 Set <String> win = driver.getWindowHandles();
 for(String mk : win)
 {
	  String tt = driver.switchTo().window(mk).getTitle();
	  if(tt.equals("Selenium - Wikipedia"))
	  {
		  driver.close();
	  }
	  else if (tt.equals("Automation Testing Practice"))
	  {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		  Alert bn = driver.switchTo().alert();
		  bn.accept();
	  }
 }	
 // This Block Does not execute
 driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
 Alert bn1 = driver.switchTo().alert();
 bn1.accept();
 
 
 
	}}
