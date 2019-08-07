package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		String str = dr.getTitle();
		if(str.equals("Demo Web Shop")) 
			System.out.println("First Title Verified");
		WebElement we = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		we.click();
		str = dr.getTitle();
		if(str.equals("Demo Web Shop. Register"))
			System.out.println("Second Title Verified");
		dr.findElement(By.id("gender-male")).click();
		dr.findElement(By.id("FirstName")).sendKeys("xxx");
		dr.findElement(By.id("LastName")).sendKeys("yyy");
		dr.findElement(By.id("Email")).sendKeys("utpal@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("qwerty");
		dr.findElement(By.id("ConfirmPassword")).sendKeys("qwerty");
		dr.findElement(By.id("register-button")).click();
		we = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		we.click();
		dr.close();
	}
}
