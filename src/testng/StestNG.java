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

public class StestNG {

	

	

	@Test(groups = {  "sanity"  })

	public void test1() {

		System.out.println("test case 1");

	}

	@Test(groups = { "smoke" , " regression " })
	public void test2() {
		System.out.println("test case 2");
	}

	@Test(groups = { "regression" })
	public void test3() {
		System.out.println("test case 3");
	}

	

	 
}
