package day10;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_calculator {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
       driver.findElement(By.id("mat-input-0")).clear();
   	   driver.findElement(By.id("mat-input-1")).clear();
   	   driver.findElement(By.id("mat-input-2")).clear();
       
       String file1 = System.getProperty("user.dir")+"\\ExcelFiles\\Calcdata.xlsx";
       int row = ExcelUtils.getRowCount(file1, "Sheet1");
       
       for (int i=1;i<=row;i++)
       {
    	   String Amount = ExcelUtils.getCellData(file1, "Sheet1", i, 0);
    	   String lod =  ExcelUtils.getCellData(file1, "Sheet1", i, 1);
    	   String rate = ExcelUtils.getCellData(file1, "Sheet1", i, 2);
    	   String freq = ExcelUtils.getCellData(file1, "Sheet1", i, 3);
    	   String apy = ExcelUtils.getCellData(file1, "Sheet1", i, 4);
    	   
    	   driver.findElement(By.id("mat-input-0")).sendKeys(Amount);
     	   driver.findElement(By.id("mat-input-1")).sendKeys(lod);
     	   driver.findElement(By.id("mat-input-2")).sendKeys(rate);
     	   
     	   
     	  driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c109-4']")).click();
     	 List <WebElement> comp  = driver.findElements( By.xpath("//*[@class=\"cdk-overlay-pane\"]/div/div/mat-option/span"));
     	for(int j=0;j<comp.size();j++)
        {
        	if(comp.get(j).getText().equals(freq)) 
        	{
        	comp.get(j).click();
        	break;
        	}
        }
     	
     	driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
     	
     	String val = driver.findElement(By.xpath("//*[@id=\"cdAPY\"]")).getText();
     	if(apy.equals(val))
  	  {
  		  System.out.println("Test is passed");
  		  ExcelUtils.setCellData(file1, "Sheet1", i, 6, "Passed");
  		  ExcelUtils.fillGreenColor(file1, "Sheet1", i, 6);
  	  }
  	  else
  	  {
            System.out.println("Test is failed");
  		  ExcelUtils.setCellData(file1, "Sheet1", i, 6, "Failed");
  		  ExcelUtils.fillRedColor(file1, "Sheet1", i, 6);
  	  }
     
     	 driver.findElement(By.id("mat-input-0")).clear();
   	   driver.findElement(By.id("mat-input-1")).clear();
   	   driver.findElement(By.id("mat-input-2")).clear();
	}

}}
