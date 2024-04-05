package day12;

import org.testng.annotations.Test;

public class Grouping_demo {

	@Test(priority=1, groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("This is login by email");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println("This is login by facebook");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("This is login by twitter");
	}
	
	@Test(priority=4, groups= {"sanity","regression"})
	void signupbyemail()
	{
		System.out.println("This is Sign up by email");
	}
	
	@Test(priority=5,  groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("This is Sign up by facebook");
	}
	
	@Test(priority=6, groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("This is Sign up by twitter");
	}
	
	@Test(priority=7, groups= {"sanity","regression"})
	void paymentinrupees()
	{
		System.out.println("This is payment in rupees");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void paymentindollar()
	{
		System.out.println("This is payment in dollar");
	}
	
	@Test(priority=9, groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("This is payment return by bank");
	}
	
}
