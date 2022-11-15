package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		 d.get("https://www.amazon.com/");
		
		  String title = d.getTitle();
		    
		    System.out.println(title);
		
		
	}
	

}
