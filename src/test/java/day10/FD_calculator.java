package day10;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FD_calculator {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
       
       String file = System.getProperty("user.dir")+"\\ExcelFiles\\Caldata.xlsx";
       int rows = ExcelUtils.getRowCount(file, "Sheet1");
       
       for (int i=1;i<=rows;i++)
       {
    	   String prin = ExcelUtils.getCellData(file, "Sheet1", i, 0);
    	   String roi =  ExcelUtils.getCellData(file, "Sheet1", i, 1);
    	   String per = ExcelUtils.getCellData(file, "Sheet1", i, 2);
    	   String per1 = ExcelUtils.getCellData(file, "Sheet1", i, 3);
    	   String fre = ExcelUtils.getCellData(file, "Sheet1", i, 4);
    	   String mat = ExcelUtils.getCellData(file, "Sheet1", i, 5);
    	   
    	  driver.findElement(By.name("principal")).sendKeys(prin);
    	  driver.findElement(By.name("interest")).sendKeys(roi);
    	  driver.findElement(By.name("tenure")).sendKeys(per);
    	  
    	  Select ddrp = new Select (driver.findElement(By.id("tenurePeriod")));
    	  ddrp.selectByVisibleText(per1);
    	  
    	  Select fredrp = new Select (driver.findElement(By.id("frequency")));
    	  fredrp.selectByVisibleText(fre);
    	  
    	  driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
    	  
    	  String actval = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
    	  
    	  if(Double.parseDouble(mat)==Double.parseDouble(actval))
    	  {
    		  System.out.println("Test is passed");
    		  ExcelUtils.setCellData(file, "Sheet1", i, 7, "Passed");
    		  ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
    	  }
    	  else
    	  {
              System.out.println("Test is failed");
    		  ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
    		  ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
    	  }
    	  driver.findElement(By.xpath("//img[@class='PL5']")).click();
       }

	}

}
