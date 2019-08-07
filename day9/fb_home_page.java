package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_home_page {
	WebDriver dr;
	By xpath_profile_name = By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span");
	public fb_home_page(WebDriver dr) {
		this.dr = dr;
	}
	public String get_profile_name() {
		return dr.findElement(xpath_profile_name).getText();
	}
}
