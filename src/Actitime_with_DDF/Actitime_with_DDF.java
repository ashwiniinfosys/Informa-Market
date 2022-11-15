package Actitime_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actitime_with_DDF {
public static void main(String[] args) throws Throwable {
	//Excel file Address
	FileInputStream fis = new FileInputStream("C:\\Software Testin\\Automation\\Selenium\\Promas\\Ashwini.xlsx");
	// To store Sheet
	Sheet sh =WorkbookFactory.create(fis).getSheet("Sheet1");
	//Set the Property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	//Enter UN
	String UN= sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	// enter the PWD
	String PWD=sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
	//click on login btn
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	//verify data
	String expT=sh.getRow(0).getCell(2).getStringCellValue();
	String actR=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
	if (expT.equals(actR)) {
		System.out.println("Hey TC is Pass");
		
	}
	else {
		System.out.println("Tc is fail");
	}
	
}
}
