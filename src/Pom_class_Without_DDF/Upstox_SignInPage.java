package Pom_class_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_SignInPage {
//Declaration 
	@FindBy(xpath = "//input[@id='userCode']") private WebElement ID;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement SIGN;
	
	//Initialization
	public Upstox_SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterID() {
		ID.sendKeys("AR2808");
	}
	public void enterPWD() {
		PWD.sendKeys("Krishana@123");
	}
	public void signinpage() {
		SIGN.click();
	}
}
