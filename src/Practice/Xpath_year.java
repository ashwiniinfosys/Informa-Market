package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_year {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		
		WebDriver velocity = new ChromeDriver();
		
		velocity.get("https://www.facebook.com/login.php/");
		
		Thread.sleep(3000);
		
		// sign up for page
		
		velocity.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		// select dd which we need to handle
		 Thread.sleep(3000);
		    WebElement year =velocity.findElement(By.xpath("//select[@id='year']"));
		    
		    //create object of select class
		     Select s = new Select(year);
		     
		     //use select class methods(select by text)
		    // s.selectByVisibleText("17");
		    
		     // select by value
		     s.selectByValue("1998");
		     
	}



}
