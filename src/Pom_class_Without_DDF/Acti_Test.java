package Pom_class_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_Test {
public static void main(String[] args) throws Throwable {
	
    //Set Properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	
	//Login page Object
	Acti_Login_page l = new Acti_Login_page(driver);
	l.enterUN();
	l.enterPWD();
	l.clickLoginBTN();
	
	Thread.sleep(5000);
	
	//Home Page Object
	Acti_HomePage h= new Acti_HomePage(driver);
	h.verifytext();
}
}
