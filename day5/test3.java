package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test3 {
	public static void main(String args[]) {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		WebDriverWait wt = new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		dr.findElement(By.xpath("")).click();
		
		dr.navigate().back();
		dr.navigate().forward();
		dr.navigate().refresh();
	//	dr.navigate().to(url);
		
	}
}
