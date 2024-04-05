package day10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable_handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://demo.opencart.com/admin/");
       
       driver.findElement(By.id("input-username")).sendKeys("demo");
 	   driver.findElement(By.id("input-password")).sendKeys("demo");
 	  driver.findElement(By.xpath("//button[@type='submit']")).click();
 	  
 	  Thread.sleep(5000);
 	 driver.findElement(By.xpath("//*[@class=\"btn-close\"]")).click();  
 	driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click(); 
 	driver.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
 	
 	String txt = driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[2]")).getText();
 	int pages = Integer.parseInt(txt.substring(txt.indexOf("(")+1, txt.indexOf("Pages")-1));
 	System.out.println("Total Number of pages are: "+ pages);
 	
 	int row = driver.findElements(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr")).size();
 	int col = driver.findElements(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/thead/tr/td")).size();
 	System.out.println("Number of rows:" + row);
    System.out.println("Number of columns:" + col);
    
 	 for(int a=1;a<=4;a++)
 	 {
 		 if (pages>1)
 		 {
 			WebElement ap=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[1]/ul/li/*[text()="+a+"]"));
 			System.out.println(" Active Page : "+ap.getText());
 			JavascriptExecutor mn = driver;
 			 mn.executeScript("arguments[0].click();", ap);
			Thread.sleep(2000);
 			
 		 }
 		 
 		for(int r=1;r<=row;r++)
		{
			String Name=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr["+r+"]/td[2]")).getText();
			String Email=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr["+r+"]/td[3]")).getText();
			String status=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr["+r+"]/td[5]")).getText();
			String date=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr["+r+"]/td[6]")).getText();
			
			System.out.println(Name+"      "+Email+"          "+status+"        "+date);
		}
 		
     }
 	driver.close();
	}

}
