package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class methods {	
	 @Test	 
	 public void mobileBu () {	
		 
		 
		 SoftAssert  softassert = new  SoftAssert();
		 
		 
		 
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver  driver =  new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 org.testng.Assert.assertEquals("Google", driver.getTitle());
		 
		 softassert.assertAll();
		 softassert.
		 
		
	 }	 
		/*
		 * @Test public void mobileB () { System.out.println("B"); }
		 * 
		 * @Test public void mobileBb () {
		 * 
		 * System.out.println("G"); }
		 * 
		 * @Test
		 * 
		 * public void mobileBf() {
		 * 
		 * System.out.println("S"); }
		 */
}
