package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test2 {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.faceboook.com");	
		WebElement we = dr.findElement(By.id("day"));
		Select sel = new Select(we);
		sel.selectByVisibleText("10");
		
	}
}
