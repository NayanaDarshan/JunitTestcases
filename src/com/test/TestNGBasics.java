package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class TestNGBasics {

	@BeforeClass

	public void LaunchBrowser() {

		System.out.println("Launching the browser");

	}

	@Test(groups="GroupA", priority =1)
	public void TestMethod1() {

		System.out.println("Test Method1");

	}

	@Test(groups="GroupA",priority =3)
	public void TestMethod2() {
		System.out.println("Test Method2");
	}

	@Test(groups="GroupB", priority =2)
	public void TestMethod3() {
		System.out.println("Test Method3");
	}

	@AfterClass

	public void CloseBrowser() {

		System.out.println("closing the browser");

	}

}
