package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) throws Throwable {
		
	// set property of webdriver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   
	// create object of chrome browser
	
	ChromeOptions c= new ChromeOptions();
	Thread.sleep(3000);
	c.addArguments("--disable-notifications");
	//c.addArguments("start-maximized");
	
	// open Browser
	WebDriver driver = new ChromeDriver(c);
	Thread.sleep(3000);
	driver.get("https://www.hdfc.com/");
}
}