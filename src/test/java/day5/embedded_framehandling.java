package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class embedded_framehandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
        driver.get("https://ui.vision/demo/webtest/frames/");
        
        WebElement zx = driver.findElement(By.xpath("html/frameset/frame[1]"));
        driver.switchTo().frame(zx);
        
        driver.findElement(By.name("mytext1")).sendKeys("12345");
        
        driver.switchTo().defaultContent();
        
        WebElement cv = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
        driver.switchTo().frame(cv);
        
        driver.findElement(By.name("mytext3")).sendKeys("ABCDE");
      
        driver.switchTo().frame(0);
        
        driver.findElement(By.xpath("//*[@id=\"i8\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"i22\"]")).click();
       
        driver.switchTo().defaultContent();
        
        WebElement bn = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
        driver.switchTo().frame(bn);
        
        driver.findElement(By.name("mytext4")).sendKeys("Hello! Good Morning");
        
        
        

	}

}
