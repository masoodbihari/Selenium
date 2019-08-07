package day6;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_test_cases {	
	static void test(ArrayList<excel_io_test_data> arr) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		for(int i=0;i<4;i++) {
			excel_io_test_data obj = arr.get(i);
			WebDriver dr = new ChromeDriver();
			dr.get("http://demowebshop.tricentis.com/");
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(obj.UserId);
			dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(obj.Password);
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			boolean signal1 = false,signal2 = false;
			try {
				signal1 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).isDisplayed();
			}catch(Exception e) {
				signal1 = false;
			}
			try {
				signal2 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).isDisplayed();
			}catch(Exception e) {
				signal2 = false;
			}
			if(signal1 == false && signal2 == false) {
				obj.Actual = dr.findElement(By.className("account")).getText();
				System.out.println("Successful Login");
			}
			else if(signal1 == true) {
				obj.Actual = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).getText();
				System.out.println(obj.Actual);
			}
			else {
				obj.Actual = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
				System.out.println(obj.Actual);
			}
			if(obj.Actual.equals(obj.Expected))
				obj.Result = "pass";
			else
				obj.Result = "fail";
			dr.close();
		}
	}
}
