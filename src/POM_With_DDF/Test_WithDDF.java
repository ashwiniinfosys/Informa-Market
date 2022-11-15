package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_WithDDF {
public static void main(String[] args) throws Throwable {
	//Excel sheet path 
	FileInputStream fis = new FileInputStream("C:\\Software Testin\\Automation\\Selenium\\Promas\\Ashwini.xlsx");
	//Fetch The Sheet
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	//Set Property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	//Fetch Data from Excel Sheet 
	String username= sh.getRow(0).getCell(0).getStringCellValue();
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	String expT =sh.getRow(0).getCell(2).getStringCellValue();
	//Create object of LoginPage

	LoginPage lp=new LoginPage(driver);
	lp.enterUN(username);
	lp.enterPWD(password);
	lp.clickloginBTN();
	
	Thread.sleep(5000);
	
	//Create objet of HomePage
	HomePage hp = new HomePage(driver);

	hp.verifytext(expT);
}
}
