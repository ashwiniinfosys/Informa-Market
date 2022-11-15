package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	 
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://demo.actitime.com/login.do");
	   //enter user
	 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("manaer");
	 
	 
	   // pwd
	 driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("Sunita");
	 
}
	
	
}
