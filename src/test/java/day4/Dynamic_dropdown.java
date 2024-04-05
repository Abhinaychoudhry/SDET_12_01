package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.google.com/");
        
        driver.findElement(By.name("q")).sendKeys("Selenium");
        
        Thread.sleep(4000);
        
        List <WebElement> gol  = driver.findElements( By.xpath("//*[@class=\"wM6W7d\"]//span"));
        
        System.out.println("Total Number of options are: " + gol.size());
        
        for(int i=0;i<gol.size();i++)
               {
               	System.out.println(gol.get(i).getText());
               }

        for(int i=0;i<gol.size();i++)
        {
           	if(gol.get(i).getText().equals("selenium tutorial")) {
           	gol.get(i).click();
           	break;
           	}
        }
        
	}

}
