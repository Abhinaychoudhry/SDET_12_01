package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello");
        
        driver.switchTo().frame("frm1");
        WebElement ac = driver.findElement(By.xpath("//*[@id=\"course\"]"));
        
        Select zb = new Select(ac);
        zb.selectByVisibleText("Java");
        
        driver.findElement(By.xpath(""));
 

	}

}
