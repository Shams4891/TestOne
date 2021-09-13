package testng1;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOne {
	
	
	
	
	@BeforeGroups (value = { "sanity " })
	public void   groups() {

		System.out.println("BEFORE GROIUPS");

	}
	
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
