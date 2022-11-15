package Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Recover {
	public static void main(String[] args) {
		// set property of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		// Upcasing
		WebDriver d = new ChromeDriver();
		
		// get URL
		d.get("https://www.worldometers.info/coronavirus/country/uk");
		d.manage().window().maximize();
		
		//To print recover cases
		String recover = d.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println("To print recover cases");
		System.out.println(recover);
		
		//to print Coronavirus Cases
	//String	CoronavirusCases=d.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
	
		//by using text
		String cc =d.findElement(By.xpath("//span[text()='23,735,273 ']")).getText();
		System.out.println("To print Coronavirus Cases");
		//System.out.println(CoronavirusCases);
		
		System.out.println(cc);
	}

}
