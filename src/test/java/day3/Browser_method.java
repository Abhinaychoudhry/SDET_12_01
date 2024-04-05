package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
         
      //  driver.close();
        driver.quit();

	}

}
