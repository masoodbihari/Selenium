package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_3 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("x756789dtgrty@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("qwerty");
		//dr.findElement(By.className("login-button")).click();
		dr.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		String str = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		if(str.equals("x756789dtgrty@gmail.com"))
			System.out.println("Login Verified");
	}
}
