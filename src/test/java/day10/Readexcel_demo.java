package day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel_demo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\ExcelFiles\\data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number Of rows are: " + row);
		System.out.println("Number Of columns are: " + col);
		
		for(int i=0;i<row;i++)
		{
			XSSFRow current = sheet.getRow(i);
			for(int j=0;j<col;j++)
			{
				String cell = current.getCell(j).toString();
				System.out.print(cell + "     ");
			}
			System.out.println("");
		}
		
		wb.close();
		fis.close();
	}

}
