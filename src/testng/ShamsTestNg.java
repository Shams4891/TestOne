package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShamsTestNg {

	@BeforeGroups

	public void beforegroups() {

		System.out.println("beforegroups");
		;

	}

	public void aftergroups() {

		System.out.println("aftergroups");
		;

	}

	@BeforeSuite

	public void beforesuit() {

		System.out.println("beforeSuit");

	}

	@BeforeClass

	public void befireclass() {

		System.out.println("beforeclass");

	}

	@BeforeTest

	public void beforetest() {

		System.out.println("beforetest");

	}

	@BeforeMethod

	public void beforemethod() {

		System.out.println("beforemethod");

	}

	@Test(groups = { "sanity" })

	public void test1() {

		System.out.println("test case 1");

	}

	@Test(groups = { "smoke" , "sanity" })
	public void test2() {
		System.out.println("test case 2");
	}

	@Test(groups = { "sanity"  , "regression"})
	public void test3() {
		System.out.println(" test case 3");
	}

	@AfterTest

	public void aftertest() {

		System.out.println("aftertest");

	}

	@AfterMethod

	public void aftermethod() {

		System.out.println("aftermethod");

	}

	@AfterClass

	public void afterclass() {

		System.out.println("afterclass");

	}

	@AfterSuite

	public void aftersuit() {

		System.out.println("afteresuit");
	}

}
