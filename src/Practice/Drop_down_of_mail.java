package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_down_of_mail {
public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://www.google.com");
  
  driver.manage().window().maximize();
  
  WebElement s=driver.findElement(By.xpath("//a[text()='Gmail']"));
  
  Actions a = new Actions(driver);

  //a.moveToElement(s).perform();
 //a.moveToElement(s).contextClick().perform();
  a.moveToElement(s).click().perform();
  
}
}
