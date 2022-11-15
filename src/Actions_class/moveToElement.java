package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		 WebDriver d = new ChromeDriver();
		 
		d.get("https://www.google.com/");
		
		//inspect the element where we need to move cursor
		WebElement store = d.findElement(By.xpath("//a[text()='Gmail']"));
		
		//create object of actions class
		Actions act = new Actions (d);
		 //act.contextClick(store).perform();
		 act.moveToElement(store).perform();	
	}

}
