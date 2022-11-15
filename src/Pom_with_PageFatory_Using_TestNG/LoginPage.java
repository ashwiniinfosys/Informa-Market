package Pom_with_PageFatory_Using_TestNG;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import logical_program.primeno;

public class LoginPage {

	//Declaration 
@FindBy(xpath ="//input[@id='username']") private WebElement UN;
@FindBy(xpath = "//input[@name='pwd']") private WebElement PWD;
@FindBy(xpath = "//div[text()='Login ']") private WebElement LoginBTN;

//Creat constructor
 public LoginPage(WebDriver Driver) {
	 PageFactory.initElements(Driver, this);
	 
 }

 //Create Methods
 public void enterUN(String username) {
	 UN.sendKeys(username);
 }
 public void enterPWD(String password) {
	 PWD.sendKeys(password);
 }
 public void clickLoginBTN() {
	 LoginBTN.click();
 }

}
