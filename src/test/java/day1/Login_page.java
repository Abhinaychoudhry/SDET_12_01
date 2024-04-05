package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/index.php"); 
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String actvalue = driver.getTitle();
		String expvalue = "Login: Mercury Tours";
		
		if(actvalue.equals(expvalue))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
		
		driver.close();
	}

}
