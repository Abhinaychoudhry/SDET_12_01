package day12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_demo {
	
	@BeforeSuite
	public void bs() 
	  {
		  System.out.println("This is Before Suite"); 
	  }
	
	@BeforeTest
	public void bt() 
	  {
		  System.out.println("This is Before Test"); 
	  }
	@BeforeClass
	public void bc() 
	  {
		  System.out.println("This is Before class"); 
	  }
	@BeforeMethod
	public void login() 
	  {
		  System.out.println("This is Before method"); 
	  }
	
	@Test
	public void search() 
	  {
		  System.out.println("This is Search"); 
	  }
	 
	@Test
	 public void advsearch() 
	  {
		  System.out.println("This is Advanced Search"); 
	  }
	 
	@AfterMethod
	 public void logout() 
	  {
		  System.out.println("This is After method"); 
	  }
	@AfterClass
	public void ac() 
	  {
		  System.out.println("This is After class"); 
	  }
	@AfterTest
	public void at() 
	  {
		  System.out.println("This is After Test"); 
	  }
	@AfterSuite
	public void as() 
	  {
		  System.out.println("This is After Suite"); 
	  }

}
