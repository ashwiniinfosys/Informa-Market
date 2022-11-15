package Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {
	public static void main(String[] args) {
		// set property of webdriver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		
	d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("I Phone 14",Keys.ENTER);
String	p=d.findElement(By.xpath("(//div[@class='sg-col sg-col-4-of-12 sg-col-4-of-16 sg-col-4-of-20'])[2]")).getText();

System.out.println(p);
	}

}
