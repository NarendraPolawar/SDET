package TestClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import Test.POM1;

public class TestTestClass extends BaseTest {

	POM1 Narendra;
	@BeforeClass 
	public void launchB() {
		launchBrowser7();
		Narendra = new POM1(driver);
		}
	
	
	@BeforeMethod
	public void beforeM() {
	Narendra.date();
	Assert.assertTrue(true);
	System.out.println("True");
	Narendra.india();
	Assert.assertTrue(true);
	System.out.println("True");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Both Date and Origin Country are verified ");
	}
	
	
	
	@AfterMethod
	public void afterM() {
	}
	
	
	@AfterClass
	public void afterclass() {
	}
	
}
