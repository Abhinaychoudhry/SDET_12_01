package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        
        //selecting one option from dropdown
        
        WebElement dd = driver.findElement( By.xpath("//select[@id='country-list']"));
        Select drp = new Select(dd);
        WebElement ab = driver.findElement( By.xpath("//*[@id=\"state-list\"]"));
        Select dsd = new Select(ab);
        
   //     drp.selectByVisibleText("India");
      drp.selectByIndex(4);
 //       drp.selectByValue("4");
        
        dsd.selectByValue("23");
    //    dsd.selectByVisibleText("Delhi");
 //       dsd.selectByIndex(2);
        
        
        List <WebElement> options = dsd.getOptions();
        for (int i =0;i<options.size();i++)
        {
        	System.out.println("Options are: " + options.get(i).getText());
        }
        
	}

}
