package day7;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test3 {
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
