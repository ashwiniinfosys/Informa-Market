package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) throws Throwable {
	//Set property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
    // Swith to First Frame
		driver.switchTo().frame("packageListFrame");
		//take any one element of that iframe & store
		String f1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(f1);
		
		////now we need to switch from 1st frame to main webpage
		driver.switchTo().defaultContent();
		//swith to 2 frame
		driver.switchTo().frame("packageFrame");
		String f2 = driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
		System.out.println(f2);
		
		//main frame
		driver.switchTo().defaultContent();
		
	//swith to 3rd frame
		driver.switchTo().frame("classFrame");
        String f3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(f3);
	
}	 		
}
