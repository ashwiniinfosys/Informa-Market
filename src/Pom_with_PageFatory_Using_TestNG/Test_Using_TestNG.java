package Pom_with_PageFatory_Using_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Using_TestNG {
	//Globally Declare the member
	Sheet sh;
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	//To open browser	
@BeforeClass
public void openBrowser() throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Software Testin\\Automation\\Selenium\\Promas\\Ashwini.xlsx");
	WorkbookFactory.create(fis).getSheet("Sheet1");
	//Set property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// Add implicit wait
	        Thread.sleep(5000);
			driver.get("https://demo.actitime.com/login.do");
			 Thread.sleep(5000);
			
			//all Object
			lp= new LoginPage(driver);
			hp = new HomePage(driver);
}
	@BeforeMethod
	public void openApp() {
		//enterUN
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		lp.enterUN(username);
		
		//enterPWD 
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	lp.enterPWD(password);
	
	//click on LoginBTN
	lp.clickLoginBTN();
	}
	@Test
	public void verifyText() {
		Reporter.log("Running to verify text", true);
		String expT = sh.getRow(0).getCell(2).getStringCellValue();
		String actT = hp.verifyText();
		Assert.assertEquals(expT, actT, "Failed Both are different");                                   
	}
	@AfterMethod
	public void closeApp() {
		Reporter.log("Logout from Application");
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the application");
	}

}
