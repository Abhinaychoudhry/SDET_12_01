package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://automationbookstore.dev/");
        
        Thread.sleep(3000);
        WebElement obj = driver.findElement(By.xpath("//li[@id='pid6']"));
        
        String a = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(obj)).getText();
        System.out.println(a);   
	}

}
