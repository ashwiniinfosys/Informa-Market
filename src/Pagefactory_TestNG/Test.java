package Pagefactory_TestNG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Test {
	//globally declare some values
		Sheet sh;
		WebDriver driver;
		LoginPage lp;
		HomePage hp;
		

		@BeforeClass
		public void  openBrowser() throws Throwable {
			FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\Nandkumar_NK.xlsx");
			 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
			 driver=new ChromeDriver();
			Thread.sleep(10000);
			 
			 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.actitime.com/login.do");
			//all objects
			 lp=new LoginPage(driver);
			 hp=new HomePage(driver);


}
