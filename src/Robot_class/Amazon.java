package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//open amazon site
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();

	//create object of robot class
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	
   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
   
   Thread.sleep(3000);
   
   r.keyPress(KeyEvent.VK_PAGE_DOWN);
   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
