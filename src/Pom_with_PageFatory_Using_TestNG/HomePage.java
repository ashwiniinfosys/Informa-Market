package Pom_with_PageFatory_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Declaration 
	@FindBy(xpath = "Enter Time-Track") private WebElement text;
	
	// constructor creat
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Method
	public String verifyText() {
		String actT = text.getText();
		return actT;
	}
}
