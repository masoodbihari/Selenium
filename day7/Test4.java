package day7;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {
	ArrayList<excel_io_test_data> arr;
	WebDriver dr;
	
	@BeforeClass
	public void class_1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		arr = new ArrayList<excel_io_test_data>();
		excel_io_test_data.readExcel(arr);
	}
	@AfterClass
	public void class_2() {
		dr.quit();
	}
	@BeforeMethod
	public void method_1() {
		dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
	}
	@Test
	public void test1() {
		check_test_cases.login(arr.get(0), dr);
		Assert.assertEquals(arr.get(0).Actual, arr.get(0).Expected);
	}
	@Test
	public void test2() {
		check_test_cases.login(arr.get(1), dr);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(arr.get(1).Actual, arr.get(1).Expected);
	//	Assert.assertEquals(arr.get(1).Actual, arr.get(1).Expected);
		sa.assertAll();
	}
	@Test
	public void test3() {
		check_test_cases.login(arr.get(2), dr);
		Assert.assertEquals(arr.get(2).Actual, arr.get(2).Expected);
	}
	@Test
	public void test4() {
		check_test_cases.login(arr.get(3), dr);
		Assert.assertEquals(arr.get(3).Actual, arr.get(3).Expected);
	}
	
}
