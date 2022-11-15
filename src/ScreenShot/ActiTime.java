package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActiTime {
public static void main(String[] args) throws Throwable {
	//set Prperty
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//Typecast 
	TakesScreenshot ts =(TakesScreenshot)driver;
	//get screnshot method
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 // Create object of folder & provide the path with prper name & extension
	 File storess = new File("C:\\Software Testin\\Automation\\Selenium\\Store ScreenShot\\Actitime.jpg");
	 // Copy frm src to dest
	 Files.copy(src, storess);	 
	
}
}
