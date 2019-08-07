package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class test2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://facebook.com");
		Actions act1 = new Actions(dr);
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\"u_0_p\"]"));
		WebElement we2 = dr.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
		Action set1 = act1
				.moveToElement(we1)
				.click(we1)
				.sendKeys("java")
				.keyDown(we1, Keys.CONTROL)
				.sendKeys("A")
				.keyUp(we1,Keys.CONTROL)
				.build();
		set1.perform();
		Actions act2 = new Actions(dr);
		Action set2 = act2
				.moveToElement(we2)
				.click(we2)
				.keyDown(we2, Keys.CONTROL)
				.sendKeys("A")
				.keyUp(we2,Keys.CONTROL)
				.build();
		set2.perform();
		
		
	}
}
