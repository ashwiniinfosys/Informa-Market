package Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		 WebDriver driver = new ChromeDriver();
		 //to open fb browser
		 driver.get("https://www.facebook.com/login/");
		 
		 // using keys class login fb
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9130406881",Keys.TAB,"9139338967",Keys.ENTER);
	}

}
