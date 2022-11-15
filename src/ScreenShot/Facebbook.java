package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Facebbook {
public static void main(String[] args) throws Throwable {
	//Set property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	//Typecast
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	//use getScreenshot method
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	//Create folder to store SS , Creat object of folder by passing the argu with proper name & extention
		File screenshot = new File("C:\\Software Testin\\Automation\\Selenium\\Store ScreenShot\\Facebook.jpg");
	
		//Use Files to copy ss from src to screenshot
		Files.copy(src, screenshot);
}
}
