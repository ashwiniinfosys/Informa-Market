package Practice;
// to handle mouse related actions
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://google.com");
		
		d.manage().window().maximize();
	
		//inspect element where we need to move cursor
	WebElement	t=d.findElement(By.xpath("//a[text()='Gmail']"));
	
	//create object of action class
	Actions act = new Actions(d);
	act.moveToElement(t).perform();
	}
}
