package Pratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First extends LibGlobal{
	
	@BeforeClass
	public void browser() {
	browserConfig();
	}
	@AfterClass
	public void close() {
	close();	
	}
	@Test
	public void tc1() {
		openBrowser("https://www.facebook.com/");
	}

}
