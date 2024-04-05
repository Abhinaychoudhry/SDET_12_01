package day7;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        
        WebElement dd = driver.findElement( By.xpath("//select[@id='country-list']"));
        Select drp = new Select(dd);
        WebElement ab = driver.findElement( By.xpath("//*[@id=\"state-list\"]"));
        Select dsd = new Select(ab);
        
        drp.selectByVisibleText("India");
       dsd.selectByVisibleText("Delhi");
	}
}
