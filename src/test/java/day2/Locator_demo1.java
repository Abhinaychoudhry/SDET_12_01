package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_demo1 {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		List <WebElement> img =  driver.findElements(By.className("homeslider-container"));
		
		System.out.println("Number of images the slider contains:  " + img.size());
		
		List <WebElement> image =  driver.findElements(By.tagName("img"));
		System.out.println("Number of images the page contains:  " + image.size());
		
		List <WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("Number of links the page contains:  " + links.size());
		

	}

}
