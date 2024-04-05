package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hiddenelement_practice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");
       
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[2]/i")).click();
       
    
       
       List <WebElement> vb = driver.findElements(By.xpath("//*[@class=\"oxd-select-dropdown --positon-bottom\"]//span"));
       System.out.println("Size of the List is: " + vb.size());
       
       
       System.out.println("Elements of the List are: ");
       for(int i=0;i<vb.size();i++)
       {
    	 if( vb.get(i).getText().equals("Part-Time Contract"))
    	 {
    		 vb.get(i).click();
    	 }
       }
//          WebElement emp = driver.findElement( By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']"));
 //      Select op = new Select(emp);
  //     op.selectByVisibleText("Part-Time Contract")
       
       

	}

}
