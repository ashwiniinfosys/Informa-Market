package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* It is also used to open application 
 1. forward
 2. come backward
 3. refresh */

public class Navigate {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://google.com");
		
		Thread.sleep(3000);
		
	    driver.get("https://www.amazon.com/");
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();//now control goes to google
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();//now control goes to amazon
	    driver.navigate().refresh();//whenever page is refreshed in automation at that time address of webpage can be change

		
		
	}
}
