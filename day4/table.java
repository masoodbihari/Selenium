package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/html/html_tables.asp");
		String data = "",xp = "";
		for(int r=2;r<=7;r++) {
			for(int c = 1;c<=3;c++) {
				xp = "//*[@id=\"customers\"]/tbody/tr[" + r + "]/td[" + c + "]";
				data = dr.findElement(By.xpath(xp)).getText();
				System.out.print(data + "     ");
			}
			System.out.println();
		}
	}
}
