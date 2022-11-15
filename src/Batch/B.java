package Batch;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
	@Test
	public void TC4() {
		Reporter.log("I FROM TC4", true);
	}
	@Test
	public void TC5() {
		Reporter.log("I FROM TC5", true);
	}
	@Test
	public void TC6() {
		Reporter.log("I FROM TC6", true);
	}
}
