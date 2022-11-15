package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		 d.get("https://www.amazon.com/");
		 
		 //Maximizes
		 d.manage().window().maximize();
		 
		 //set size
		 Dimension di = new Dimension(500, 770);
		 d.manage().window().setSize(di);
		 
		 Thread.sleep(2000);
		  
		 //set position
		 Point p = new Point(200, 350);
		 d.manage().window().setPosition(p);
		 
		 //page source
		 String allelements =d.getPageSource();
		 System.out.println(allelements);
		 
		 //get title
		 String title =d.getTitle();
		 System.out.println(title);
		 
		 Thread.sleep(2000);
		 
		 
		 //minimize
		 d.close();
}}
