package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions_demo {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
       driver.get("https://text-compare.com/");
       
       driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hey! How are you?");
       
       Actions ac = new Actions(driver);
       ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
       ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
       
       ac.sendKeys(Keys.TAB).perform();
       ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
       
	}

}
