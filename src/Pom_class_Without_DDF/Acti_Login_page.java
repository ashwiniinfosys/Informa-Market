package Pom_class_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Login_page {
	// Declaration the all webelements
	
	@FindBy(xpath ="//input[@id='username']") private WebElement UN;
	@FindBy(xpath ="//input[@class='textField pwdfield']") private WebElement PWD;
	@FindBy(xpath ="//div[text()='Login ']") private WebElement LoginBTN;
	
	//Initialization
	public Acti_Login_page(WebDriver driver) {
    PageFactory.initElements(driver,this);
    
	}
	public void enterUN() {
		UN.sendKeys("admin");
	}
	public void enterPWD() {
		PWD.sendKeys("manager");
	}
    public void clickLoginBTN() {
    	LoginBTN.click();
    }
}
