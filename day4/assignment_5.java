package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_5 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String str = dr.getTitle();
		if(str.equals("Online Bookstore"))
			System.out.println("Verified");
		WebElement we = dr.findElement(By.name("category_id"));
		Select se = new Select(we);
		se.selectByVisibleText("Databases");
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.xpath("//table[@class = \"Grid\"]//td[2]//a")).click();
		if(str.equals("Web Database Development"))
			System.out.println("Verified");
		we = dr.findElement(By.xpath("//p//input[1]"));
		we.clear();
		dr.findElement(By.xpath("//p//input[1]")).sendKeys("2");
		dr.findElement(By.xpath("//form//input[@name = \"Insert1\"]")).click();
		str = dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[2]")).getText();
		str = str.substring(1);
		float num = Float.parseFloat(str);
		float total_1 = num*2;
		str = dr.findElement(By.xpath("//tr[@valign=\"top\"]//p")).getText();
		str = str.substring(8);
		float total_2 = Float.parseFloat(str);
		if(total_1 == total_2)
			System.out.println("Test Verified and passed.");
		else
			System.out.println("Test Verified and failed");
	}
}
