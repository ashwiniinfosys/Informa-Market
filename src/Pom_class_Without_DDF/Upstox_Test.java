package Pom_class_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_Test {
	public static void main(String[] args) throws Throwable {
		
	    //Set Properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(5000);
		
		//Object of Signinpage
		Upstox_SignInPage s= new Upstox_SignInPage(driver);
		s.enterID();
		s.enterPWD();
		s.signinpage();
		
		Thread.sleep(5000);
		
		
		//Object of Pagecode
		Upstox_pagecodePage p= new Upstox_pagecodePage(driver);
		p.enterpasscode();
}}
