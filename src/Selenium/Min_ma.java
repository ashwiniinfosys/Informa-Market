package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Min_ma {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/");
    //maximize
    driver.manage().window().maximize();
    
    //minimize
    Thread.sleep(4000);
    driver.get("https://www.amazon.com/");
   //driver.manage().window().minimize();
   
   Thread.sleep(4000);
    
    //setsize()
    Dimension d=new Dimension(100,200);
    driver.manage().window().setSize(d);
    
    
    //setposition
    Point p=new Point(300,400);
    driver.manage().window().setPosition(p);
    
    Thread.sleep(4000);
    
    driver.manage().window().maximize();
    
   // driver.manage().window().mini
    
}
}
