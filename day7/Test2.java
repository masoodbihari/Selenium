package day7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeClass
	public void  a() {
		System.out.println("in before class");
	}
	@AfterClass
	public void b() {
		System.out.println("in after class");
	}
	@BeforeMethod
	public void func1() {
		System.out.println("in before method");
	}
	@AfterMethod
	public void func2() {
		System.out.println("in after method");
	}
	@Test
	public void test1() {
		System.out.println("in test1");
	}
	@Test
	public void test2() {
		System.out.println("in test2");
	}
	
	
	
}
