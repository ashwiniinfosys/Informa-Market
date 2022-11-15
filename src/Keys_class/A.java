package Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		 WebDriver driver = new ChromeDriver();
		 
		 // to open browser
		 driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(3000);
		 
		 // using keys class login application
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin", Keys.TAB,"manager",Keys.ENTER);		
	}
}

