package day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingexcel_demo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+ "\\ExcelFiles\\myfile.xlsx");

		XSSFWorkbook work = new XSSFWorkbook();
		
		XSSFSheet sheet = work.createSheet("Sheet1");
		
		//without for loop
		
	/*	XSSFRow r = sheet.createRow(0);
		r.createCell(0).setCellValue("Welcome");
		r.createCell(1).setCellValue("to");
		r.createCell(2).setCellValue("Automation");
		
		XSSFRow r1 = sheet.createRow(1);
		r1.createCell(0).setCellValue("Hey!");
		r1.createCell(1).setCellValue("How are");
		r1.createCell(2).setCellValue("you?");
		
		work.write(fos);  */
		
		//with for loop
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<3;i++)
		{
			XSSFRow current = sheet.createRow(i);
			for(int j=0;j<2;j++)
			{
				// current.createCell(0).setCellValue("Hey!");
				
				System.out.println("Enter value of cell: ");
				String data = sc.next();
				current.createCell(j).setCellValue(data);
			}
		}
		
		work.write(fos);
		
		System.out.println("File writting is complete");
		work.close();
		fos.close();
		
	}

}
