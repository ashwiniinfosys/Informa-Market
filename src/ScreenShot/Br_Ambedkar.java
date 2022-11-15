package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.google.common.io.Files;

public class Br_Ambedkar {
public static void main(String[] args) throws Throwable {
	//Set Property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://en.wikipedia.org/wiki/B._R._Ambedkar");
    
    //Find The Particular Element 
    WebElement particular = driver.findElement(By.xpath("//span[text()='B. R. Ambedkar']"));
    
    //getScrenshot Method
    File src = particular.getScreenshotAs(OutputType.FILE);
    
    //creat the object of folder 
    File name= new File("C:\\Software Testin\\Automation\\Selenium\\Store ScreenShot\\name.jpg");
    
    //copy into folder
    
    Files.copy(src, name);
	    
}
}
