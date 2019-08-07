package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class test1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		WebElement we1 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
		WebElement we2 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a"));
		Actions act = new Actions(dr);
		Action set1 = act.moveToElement(we1).build();
		set1.perform();
		Action set2 = act.moveToElement(we2).click().build();
		set2.perform();
		
	}
}
