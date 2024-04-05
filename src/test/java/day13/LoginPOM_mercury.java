package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM_mercury {
	WebDriver driver;
	
	LoginPOM_mercury(WebDriver driver)
	{
		this.driver=driver;
	}

	By User = By.xpath("//input[@name='userName']");
	By pass_word = By.xpath("//input[@name='password']");
	By button = By.xpath("//input[@name='submit']");
	By logo = By.xpath("//img[@alt='Mercury Tours']");
	
	public void Uname(String user_name)
	{
		driver.findElement(User).sendKeys(user_name);
	}
	
	public void pwd(String passwd)
	{
		driver.findElement(pass_word).sendKeys(passwd);
	}
	
	public void submit()
	{
		driver.findElement(button).click();
	}
	
	public Boolean checklogo()
	{
		Boolean status = driver.findElement(logo).isDisplayed();
		return status;
	}
}
