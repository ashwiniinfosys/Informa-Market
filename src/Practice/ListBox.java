package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login.php/");
		 
		 Thread.sleep(3000);
		 
		 //sign up
		 driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		 
		 //select dd
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		 
		 //object of select class
		 Select s = new Select(day);
		 
		 //1.select by text 
		 //s.selectByVisibleText("6");
		 
		 //2.select by value
		 //s.selectByValue("11");
		 
			//3. select by index
		 s.selectByIndex(16);
		 
}
}
