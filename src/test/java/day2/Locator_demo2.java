package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_demo2 {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		//Tag & ID
	//	driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Top");
		
		//Tag & class
	//	driver.findElement(By.cssSelector("input.search_query")).sendKeys("Tops");
		
		//Tag & Attribute
	//	driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Tops");
		
		//Tag,class & Attribute
	driver.findElement(By.cssSelector("input.search_query[placeholder=\"Search\"]")).sendKeys("Tops");
		
		
		
		
		

	}

}
