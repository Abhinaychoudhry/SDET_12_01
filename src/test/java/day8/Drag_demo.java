package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
       driver.get("https://demo.guru99.com/test/drag_drop.html");
       
       WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
       WebElement az = driver.findElement(By.xpath("//ol[@id='bank']"));
       Actions cv = new Actions(driver);
       cv.dragAndDrop(bank, az).build().perform();
       
       WebElement fi = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
       WebElement am = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
       Actions cv1 = new Actions(driver);
       cv1.dragAndDrop(fi, am).build().perform();
       
       WebElement sale = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
       WebElement ab = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
       Actions cv2 = new Actions(driver);
       cv2.dragAndDrop(sale, ab).build().perform();
       
       WebElement fiv = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
       WebElement amo = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
       Actions cv3 = new Actions(driver);
       cv3.dragAndDrop(fiv, amo).build().perform();

       String text = driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).getText();
       
       if(text.equals("Perfect!"))
       {
    	   System.out.println("Pass");
       }
       else
       {
      	 System.out.println("Fail");
       }
}
}
