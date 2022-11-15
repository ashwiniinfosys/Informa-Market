package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_Up {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 
		 //typecast
		 JavascriptExecutor jse= (JavascriptExecutor)driver;
		 Thread.sleep(3000);
		 //scroll down
		 jse.executeScript("window.scrollBy (0,2000);");
		  Thread.sleep(3000);
		 // scroll up
		 jse.executeScript("window.scrollBy (0,3000);");
		 
		  
	}
}
