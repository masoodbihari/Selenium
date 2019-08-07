package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.echoecho.com/htmlforms09.htm");
		boolean cs = dr.findElement(By.name("option1")).isSelected();
		boolean fs = true;
		if(cs == false) {
			if(fs == true) {
				dr.findElement(By.name("option1")).click();
			}
		}
		else {
			if(fs == false) {
				dr.findElement(By.name("option1")).click();
			}
		}
		List<WebElement> rb = dr.findElements(By.name("Gender"));
		rb.get(0).click();
		
	}
}
