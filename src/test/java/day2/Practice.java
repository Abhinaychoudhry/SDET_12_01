package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
          ChromeDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.nopcommerce.com/");
		  
	//	  driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone 14");
		  
	//	  driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iphone 14");
		  
	//	  driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("iphone 14");
		  
		  driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("iphone 14");
		   
	}

}
