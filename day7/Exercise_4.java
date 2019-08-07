package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_4 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("xxx");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		dr.switchTo().alert().accept();
		dr.switchTo().alert().accept();
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("xxx");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		dr.switchTo().alert().dismiss();
		
	}
}
