package day9;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_demo {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://demo.nopcommerce.com/");
       
       TakesScreenshot sc = (TakesScreenshot) driver;
       
 //      File av= sc.getScreenshotAs(OutputType.FILE);
 //      File az=new File("C:\\Users\\abhin.DESKTOP-JDL9694\\eclipse-workspace\\Selenium_Maven\\Screenshot\\fullpage.png");
 //      FileUtils.copyFile(av, az);
       
       //Screenshot of specific area
       
 //      WebElement fp = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
  //     File product= fp.getScreenshotAs(OutputType.FILE);
  //          File sc1 =new File("C:\\Users\\abhin.DESKTOP-JDL9694\\eclipse-workspace\\Selenium_Maven\\Screenshot\\featuredproduct.png");
  //          FileUtils.copyFile(product, sc1);
       
       WebElement fl = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
            File logo= fl.getScreenshotAs(OutputType.FILE);
                 File sc2 =new File("C:\\Users\\abhin.DESKTOP-JDL9694\\eclipse-workspace\\Selenium_Maven\\Screenshot\\logo.png");
                FileUtils.copyFile(logo, sc2);
       
	}

}
