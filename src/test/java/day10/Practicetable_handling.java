package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetable_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
       
       int row = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr")).size();
       System.out.println("Number of rows:" + row);
       
       int col = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr//th")).size();
       System.out.println("Number of columns:" + col);
       
       System.out.println("Table Data is: ");
       for(int r=2;r<=row;r++)
       {
    	   
    	   for(int c=1;c<=col;c++)
    	   {
    		   String az = driver.findElement( By.xpath("//*[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();
    		   System.out.print(" " + az + " ");
    	   }
    	   System.out.println();
       }
       
       System.out.println("If country is Austria, then company & contact is: ");
       for(int r=2;r<=row;r++)
       {
    	   String ab = driver.findElement( By.xpath("//*[@id=\"customers\"]//tr["+r+"]//td[3]")).getText();
    	   if(ab.equals("Austria"))
    	   {
    		   String ax = driver.findElement( By.xpath("//*[@id=\"customers\"]//tr["+r+"]//td[1]")).getText();
    		   String av = driver.findElement( By.xpath("//*[@id=\"customers\"]//tr["+r+"]//td[2]")).getText();
    		   System.out.print(ax + " " + "and");
    		   System.out.print(" "+av);
    	   }
       } 
       driver.close();

	}

}
