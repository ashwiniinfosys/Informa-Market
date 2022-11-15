package Pom_class_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_pagecodePage {
	//Declarartion
	@FindBy(xpath = "//input[@id='yob']") private WebElement passcode;
	//@FindBy(xpath = "") private WebElement text;
	//Initialization
	public Upstox_pagecodePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterpasscode() {
		passcode.sendKeys("1993");
	}
	

}
