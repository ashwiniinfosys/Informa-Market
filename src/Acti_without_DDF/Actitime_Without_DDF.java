package Acti_without_DDF;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Without_DDF {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(5000);
	
		driver.manage().deleteAllCookies();
	
    driver.get("https://demo.actitime.com/login.do");
    
    //user name
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");     
    
    //Passward
    driver.findElement(By.xpath(" //input[@class='textField pwdfield']")).sendKeys("manager");
    
    
    //login button
    driver.findElement(By.xpath("//div[text()='Login ']")).click();

    Thread.sleep(000);
    
   // String expT="Enter Time-Track";
   //    String actR= driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
    
    String expText="Auto-calculated Overtime:";
	String actual=driver.findElement(By.xpath("//td[text()='Auto-calculated Overtime: ']")).getText();
    if (actual.equals(expText)) {
    	System.out.println("TC is pass");
	}
    else {
		System.out.println("Tc failed");
	}
}
}
