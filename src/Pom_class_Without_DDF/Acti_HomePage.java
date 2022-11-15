package Pom_class_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_HomePage {
//Declaration
	
	@FindBy(xpath =" //td[text()='Enter Time-Track']")private WebElement text;
	
	//initilization
	
	public Acti_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void verifytext() {
			String expT ="Enter Time-Track";
			String actT = text.getText();
			if (actT.equals(expT)) {
				System.out.println("Test case is Pass");
			}
			else {
				System.out.println("TC is fail");
			}
		}
}
