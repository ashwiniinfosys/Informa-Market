package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver aditya = new ChromeDriver();
	 
	 aditya.get("https://www.amazon.com/");
	 
	 aditya.manage().window().maximize();
	  
	 //searc 
	 aditya.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Sony Earphone");
	 
	 // to click 
	 
	
}
}
