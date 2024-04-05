package day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependant_methods {
	
	@Test
	void openurl()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority =2, dependsOnMethods= {"openurl"})
	public void login() 
	  {
		  System.out.println("This is Before method"); 
	  }
	
}
