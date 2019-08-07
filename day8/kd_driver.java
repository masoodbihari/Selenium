package day8;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kd_driver {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		ArrayList<excel_io_test_data> arr = new ArrayList<excel_io_test_data>();
		excel_io_test_data.readExcel(arr);
		int i = 0;
		WebDriver dr = new ChromeDriver();
		while(i<5) {
			excel_io_test_data obj = arr.get(i);
			switch(arr.get(i).Keyword) {
				case "launchbrowser" :
					TestMethods.LaunchBrowser(dr, obj);
					break;
				case "enter_text" :
					TestMethods.EnterText(dr, obj);
					break;
				case "click" :
					TestMethods.Click(dr, obj);
					break;
				case "verify" :
					String str = TestMethods.Verify(dr, obj);
					if(str.equals("Pass"))
						TestMethods.SetValue(arr,"Pass");
					else
						TestMethods.SetValue(arr,"Fail");
					excel_io_test_data.writeExcel(arr);
					break;
			}
			i++;
		}
		dr.close();
	}
}
