package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class first {
	@Test
	public void TC1(){
		Reporter.log("Running from TC1");
		
	}
	@Test
	public void TC2(){
		Reporter.log("Running from TC2");
		
	}
	@Test
	public void TC3(){
		Reporter.log("Running from TC3");
	}
		
}
