package Pratice;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups="sanity")
	public void tc11() {
		System.out.println("tc11");
	}
	@Test(groups="smoke")
	public void tc22() {
		System.out.println("tc22");
	}
	@Test(groups="rerun")
	public void tc33() {
		System.out.println("tc33");
	}

}
