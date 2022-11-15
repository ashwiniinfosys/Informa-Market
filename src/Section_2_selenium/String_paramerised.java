package Section_2_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_paramerised {
	public static void main(String[] args) throws Throwable {
		//Create Object of FileInputStream Class
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows 10\\Desktop\\Parameterised Stri data.xlsx");
		
		//use create method to open excel sheet
		//String s= WorkbookFactory.create(fis).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		//System.out.println(s);
		
		//to get Number
		double n=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(n);
	}

}
