package day8;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestMethods {
	static void LaunchBrowser(WebDriver dr,excel_io_test_data obj) {
		dr.get(obj.TestData);
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}
	static void EnterText(WebDriver dr,excel_io_test_data obj) {
		dr.findElement(By.xpath(obj.Xpath)).sendKeys(obj.TestData);
	}
	static void Click(WebDriver dr,excel_io_test_data obj) {
		dr.findElement(By.xpath(obj.Xpath)).click();;
	}
	static String Verify(WebDriver dr,excel_io_test_data obj) {
		String actual = dr.findElement(By.xpath(obj.Xpath)).getText();
		String expected = obj.TestData;
		if(actual.equals(expected)) {
			return "Pass";
		}
		else { 
			return "Fail";}
		
	}
	static void SetValue(ArrayList<excel_io_test_data> arr,String str) {
		for(int i=0;i<5;i++) {
			if(str.equals("Pass"))
				arr.get(i).TestResult = "Pass";
			else
				arr.get(i).TestResult = "Fail";
		}
	}
}
