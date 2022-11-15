package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_search_studytable_ {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open amazon site
		driver.get("https://www.amazon.com/");
		//maximize browser
		driver.manage().window().maximize();
		
	//to search study table
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Study Tables in Rs");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
