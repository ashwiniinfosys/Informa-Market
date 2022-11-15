package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon_Screen {
public static void main(String[] args) throws Throwable {
	//set property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 
	 //Use TakeScreenShot method & typecast Here
	 TakesScreenshot ts= (TakesScreenshot)driver;
	 
	 //Use get screenshot method & store in src
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  
	  //Create the folder & where we need to store the SS & give the path of folder with proper extention, name
	 File storess = new  File("C:\\Software Testin\\Automation\\Selenium\\Store ScreenShot\\amazon.jpg");
	 
	 //Copy Screnshot from src to storess
	 
	 Files.copy(src, storess);
	 
}
}
