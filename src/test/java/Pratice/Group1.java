package Pratice;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups="smoke")
	public void tc1() {
		System.out.println("tc1");
	}
	@Test(groups="sanity")
	public void tc2() {
		System.out.println("tc2");
	}
	@Test(groups="regression")
	public void tc3() {
		System.out.println("tc3");
	}
}
