package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM_demo {
	
	WebDriver driver;
	
	LoginPOM_demo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By user_name = By.name("username");
	By pass_word = By.name("password");
	By loginb = By.className("oxd-button");
	By logo = By.cssSelector("img[alt='company-branding']");
	
	public void setusername(String username)
	{
	driver.findElement(user_name).sendKeys(username);
	}
	
	public void setpasswordname(String password)
	{
	driver.findElement(pass_word).sendKeys(password);
	}
	
	public void loginclick()
	{
	driver.findElement(loginb).click();
	}
	
	public Boolean checklogo()
	{
		Boolean status = driver.findElement(logo).isDisplayed();
		return status;
	}
}
