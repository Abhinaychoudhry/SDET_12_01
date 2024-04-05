package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMpagefactory_nop {
	WebDriver driver;
	
	LoginPOMpagefactory_nop(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement Log_in;
	
	@FindBy(xpath="//img[@alt='nopCommerce demo store']")
	WebElement logo;
	
	public void setmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void setpassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void submit()
	{
		Log_in.click();
	}
	
	public Boolean checklogo()
	{
		Boolean status = logo.isDisplayed();
		return status;
	}

}
