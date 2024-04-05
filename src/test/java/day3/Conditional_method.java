package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_method {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        
        WebElement Register = driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
        
        Boolean Display = Register.isDisplayed();
        System.out.println("The Register Text is available: " + Display);
        
        WebElement TextBox1 = driver.findElement(By.xpath("//input[@id='FirstName']"));
        Boolean dis = TextBox1.isDisplayed();
        Boolean b = TextBox1.isEnabled();
        System.out.println("The Textbox1 is available: " + dis);
        System.out.println("The Textbox1 is available: " + b);
        
        WebElement TextBox2 = driver.findElement(By.xpath("//input[@id='LastName']"));
        Boolean dis1 = TextBox2.isDisplayed();
        Boolean a = TextBox2.isEnabled();
        System.out.println("The Textbox2 is available: " + dis1);
        System.out.println("The Textbox2 is enabled: " + a);
        
        WebElement MRadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        
        System.out.println("The Male RadioButton is available: " + MRadioButton.isDisplayed());
        System.out.println("The Male RadioButton is enabled: " + MRadioButton.isEnabled());
        MRadioButton.click();
        System.out.println("The Male RadioButton is selected: " + MRadioButton.isSelected());
        
 WebElement FRadioButton = driver.findElement(By.xpath("//label[@for='gender-female']"));
        
        System.out.println("The Female RadioButton is available: " + FRadioButton.isDisplayed());
        System.out.println("The Female RadioButton is enabled: " + FRadioButton.isEnabled());
    //    FRadioButton.click();
        System.out.println("The Female RadioButton is selected: " + FRadioButton.isSelected());
        
	}

}
