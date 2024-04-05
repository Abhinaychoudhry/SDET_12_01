package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       
       WebElement country = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
       
       WebElement state = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
       
       Actions cv = new Actions(driver);
       
       cv.dragAndDrop(state, country).build().perform();

	}

}
