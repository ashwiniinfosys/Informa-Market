package Acti_without_DDF;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act2 {
public static void main(String[] args) throws Throwable {
	//set the properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	//Enter UN 
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//Enter Password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click on login btn
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	//verify the text present on home page
	String expText="Auto-calculated Overtime:";
	String actual=driver.findElement(By.xpath("//td[text()='Auto-calculated Overtime: ']")).getText();
	if(actual.equals(expText)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("Tc Is fail");
	}
}
	

}

