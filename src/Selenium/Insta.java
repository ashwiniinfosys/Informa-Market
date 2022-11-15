package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Pari = new ChromeDriver();
		Pari.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
		
		
		//Enter Username
		Pari.findElement(By.xpath("//input[@name='username']")).sendKeys("ashuuuuu_____00");
		
		//Enter PSW
		Pari.findElement(By.xpath("//input[@name='password']")).sendKeys("ashu@00p");
		
		//click
		Pari.findElement(By.xpath("//div[text()='Log In']")).click();
	}
}
