package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
        
      /*  List <WebElement> items =  driver.findElements(By.xpath("//*[@name=\"email\"]/following::*"));
        
        System.out.println("Elements are: " + items.size()); */
        
        List <WebElement> Text =  driver.findElements( By.tagName("input"));
        		int nsize = Text.size();
        		System.out.println("Number of text boxes are –  " + nsize);
	}
}
