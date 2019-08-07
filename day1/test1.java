package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
	}
}
