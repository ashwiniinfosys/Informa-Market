package Multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class A {
	//@Parameter("browsername")
	//helps to open particular browser according to requirement
	@Test
	public void tc1(String browsername) {
		WebDriver driver=null;//run time polymorphism
if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}
else if (browsername.equals("Firefox")) {
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Windows 10\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
driver=new FirefoxDriver();
}
driver.get("https://www.google.com/");//globally declared

}
}