package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BTES_practicePOM {
	
	WebDriver driver;
	
	BTES_practicePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Lname = By.xpath("//input[@name='txtUserName']");
	By Pwd = By.xpath("//input[@name='txtPassword']");
	By submit = By.xpath("//input[@name='Submit']");
	By logo = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]");
	
	public void setLname(String name)
	{
		driver.findElement(Lname).sendKeys(name);
	}
	
	public void setpassword(String password)
	{
		driver.findElement(Pwd).sendKeys(password);
	}
	
	public void clickbutton()
	{
		driver.findElement(submit).click();
	}
	
	public Boolean checklogo()
	{
		Boolean status = driver.findElement(logo).isDisplayed();
		return status;
	}

}
