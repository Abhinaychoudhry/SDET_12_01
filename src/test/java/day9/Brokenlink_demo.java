package day9;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink_demo {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("http://www.deadlinkcity.com/");
       
       List <WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("Number of links the page contains:  " + links.size());
		
		int bl = 0;
		for(WebElement lk:links)
		{
			String href = lk.getAttribute("href");
			if (href==null || href.isEmpty())
			{
				System.out.println("Link is broken");
				continue;
			}
			
			URL ulink =new URL(href);
			HttpURLConnection con =   (HttpURLConnection) ulink.openConnection();
			con.connect();
			
			if(con.getResponseCode()>400)
			{
				System.out.println(href + " " + "This link is broken");
				bl++;
			}
			else
			{
				System.out.println(href + " " + "This link is not broken");
			}
		}
		
		System.out.println("Number of broken links: " + bl);
	}

}
