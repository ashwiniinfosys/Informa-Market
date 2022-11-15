package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	@FindBy(xpath = "//td[text()='Enter Time-Track']") private WebElement text;
	
	//Call Contructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifytext(String expT) {
		String actT=text.getText();
	if (actT.equals(expT)) {
		System.out.println("TC Is Pass");
		
	}
	else {
		System.out.println("Tc Is Fail");
	}
	}
}
