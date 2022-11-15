package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps_to_book_mobile_from_amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Sony Phone");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
	}

}
