package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpractice_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.bing.com/");
        
       
        driver.findElement(By.name("q")).sendKeys("Chandigarh");
       
      //*[@class="sa_tm"]
        Thread.sleep(4000);
        List <WebElement> df  = driver.findElements( By.xpath("//*[@class=\"sa_drw\"]/child::*]"));
        
 System.out.println("Total Number of options are: " + df.size());
        
        for(int i=0;i<df.size();i++)
               {
               	System.out.println(df.get(i).getText());
               }
      //  ruchika@bebotechnologies.com
	}

}
