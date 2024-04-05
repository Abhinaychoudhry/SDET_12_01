package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderevent_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
       
       WebElement mn = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
       System.out.println("Before Sliding Min" + mn.getLocation());
       
       Actions act = new Actions(driver);
       act.dragAndDropBy(mn, 100, 0).build().perform();
       System.out.println("After Sliding Min:" + mn.getLocation());
       
       
       WebElement max = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
       System.out.println("Before Sliding Max" + max.getLocation());
       Actions act1 = new Actions(driver);
       act.dragAndDropBy(max, -100, 0).build().perform();
       System.out.println("After Sliding Max:" + max.getLocation());
       

	}

}
