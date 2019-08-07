package day9;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test_facebook_login {
	WebDriver dr;
	Logger log;
	fb_login_page login_page_obj;
	fb_home_page home_page_obj;
	@BeforeClass
	public void  launch_browser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
	}
	@Test(priority=0)
	public void test1() {
		login_page_obj = new fb_login_page(dr);
		String login_title = login_page_obj.get_title();
		log = Logger.getLogger("devpinoyLooger");
		log.info("test1 executed");
		Assert.assertTrue(login_title.contains("Facebook"));
	}
	@Test(priority=2)
	public void test2() {
		login_page_obj.do_login("girishindia95@gmail.com", "mynewp@55");
		home_page_obj = new fb_home_page(dr);
		String actual = home_page_obj.get_profile_name();
		System.out.println("Actual Profile Name :" + actual);
		Assert.assertTrue(actual.contains("Girish"));
	}
}
