package day10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://testautomationpractice.blogspot.com/");
       
 //     int rows =driver.findElements(By.tagName("tr")).size();  //all the table of the page
 //      System.out.println(rows);
       
       int rows = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
       System.out.println("Number of rows:" + rows);
       
     
  //     int rows =driver.findElements(By.tagName("th")).size();
  //     System.out.println("Number of rows:" + rows);
       
       int col = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/th")).size();
       System.out.println("Number of columns:" + col);
       
  //     String a= driver.findElement( By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
 //      System.out.println("Data is:" + a);
       
  /*     for(int r=2;r<=rows;r++)
       {
    	   
    	   for(int c=1;c<=col;c++)
    	   {
    		   String az = driver.findElement( By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    		   System.out.print(az + " ");
    	   }
    	   System.out.println();
       }*/
       
 /*      for(int r=2;r<=rows;r++)
       {
    	   String az = driver.findElement( By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
    	   if(az.equals("Amit"))
    	   {
    		   String b = driver.findElement( By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
    		   System.out.println(b);
    	   }
       } */
       
       int sum=0;
       for(int r=2;r<=rows;r++)
       {
    	   String az = driver.findElement( By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            int as= Integer.parseInt(az);
            sum= sum+as;
       }   
       System.out.println("Sum is: " + sum);
	}

}
