package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangetable_handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		
		int row = driver.findElements(By.xpath("//div[@class=\"oxd-table-body\"]/child::*")).size();
		int col = driver.findElements(By.xpath("//*[@class=\"oxd-table-header-cell oxd-padding-cell oxd-table-th\"]/child::*")).size();
		int allcells = driver.findElements(By.xpath("//*[@class=\"oxd-table-cell oxd-padding-cell\"]/child::*")).size();
	 	System.out.println("Number of rows:" + row);
	    System.out.println("Number of cells:" + allcells);
	    System.out.println("Number of columns:" + col);

	}

}
