package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys("girishindia95@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("newfbp@55");
		dr.findElement(By.id("loginbutton")).click();
		
		String profile_name, title = dr.getTitle();
		profile_name = dr.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
		System.out.println("title : " + title + "\n profile_name" + profile_name);
		
	}
}
