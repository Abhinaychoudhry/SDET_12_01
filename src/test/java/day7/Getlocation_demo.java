package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       WebElement lg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
       System.out.println("Before Max: " + lg.getLocation());
       driver.manage().window().maximize();
       System.out.println("After Max: " + lg.getLocation());
       driver.manage().window().minimize();
       System.out.println("After Min: " + lg.getLocation());
       driver.manage().window().fullscreen();
       System.out.println("After fullscreen: " + lg.getLocation());
       
       Point p = new Point(85,100);
       driver.manage().window().setPosition(p);
       System.out.println("After limiting size: " + lg.getLocation());
       
       driver.close();

	}

}
