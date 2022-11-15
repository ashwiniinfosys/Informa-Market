package Acti_without_DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act1 {
public static void main(String[] args) throws Throwable {
	//set properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     Thread.sleep(1000);
     driver.manage().deleteAllCookies();
     driver.get("https://demo.actitime.com/login.do");
     driver.manage().window().maximize();
     //Enter User Name
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
     //enter PWD
     driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
     //click on login BTN
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
     
     Thread.sleep(5000);
     //verify the page
     String expt="Enter Time-Track";
     String actT= driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
    if (actT.equals(expt)) {
	System.out.println("pass");
}    else {
		System.out.println("TC is Fail");
	}
     
}
}
