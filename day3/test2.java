package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test2{
	public static void main(String args[]) {
		System.setProperty("webdriver.ie.driver", "D:\\drivers\\IEDriverServer.exe");
		WebDriver dr = new InternetExplorerDriver();
		dr.get("https://www.facebook.com");
		
		
	}
}
