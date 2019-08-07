package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String str = dr.getTitle();
		if(str.equals("Online Bookstore"))
			System.out.println("Title Verified");
		WebElement we = dr.findElement(By.name("category_id"));
		Select se = new Select(we);
		se.selectByVisibleText("Databases");
		dr.findElement(By.name("DoSearch"));
		dr.close();
	}
}
