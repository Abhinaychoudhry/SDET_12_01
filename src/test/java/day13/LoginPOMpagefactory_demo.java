package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMpagefactory_demo {
WebDriver driver;
	
LoginPOMpagefactory_demo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement user_name;
	
	@FindBy(name="password")
	 WebElement pass_word;
	
	@FindBy(className="oxd-button")
	WebElement loginb; 
	
    @FindBy(css="img[alt='company-branding']")
	WebElement logo;
	
	public void setusername(String username)
	{
	user_name.sendKeys(username);
	}
	
	public void setpasswordname(String password)
	{
	pass_word.sendKeys(password);
	}
	
	public void loginclick()
	{
	loginb.click();
	}
	
	public Boolean checklogo()
	{
		Boolean status = logo.isDisplayed();
		return status;
	}
}

