package Batch;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void TC1() {
		Reporter.log("I FROM TC1", true);
	}
	@Test
	public void TC2() {
		Reporter.log("I FROM TC2", true);
	}
	@Test
	public void TC3() {
		Reporter.log("I FROM TC3", true);
	}
}
