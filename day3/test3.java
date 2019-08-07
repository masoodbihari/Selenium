package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		WebDriver ieDr = new FirefoxDriver();
		ieDr.get("https://www.facebook.com");
		
	}
}
