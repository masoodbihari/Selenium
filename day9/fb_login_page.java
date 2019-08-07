package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_login_page {
	WebDriver dr;
	static By xpath_username = By.xpath("//*[@id=\"email\"]");
	static By xpath_password = By.xpath("//*[@id=\"pass\"]");
	static By xpath_button = By.xpath("//*[@id=\"loginbutton\"]");
	public  fb_login_page(WebDriver dr) {
		this.dr = dr;
	}
	public void set_username(String username) {
		dr.findElement(xpath_username).sendKeys(username);
	}
	public void set_password(String password) {
		dr.findElement(xpath_password).sendKeys(password);
	}
	public void click() {
		dr.findElement(xpath_button).click();
	}
	public void do_login(String u,String p) {
		set_username(u);
		set_password(p);
		click();
	}
	public String get_title() {
		return dr.getTitle();
	}
}
