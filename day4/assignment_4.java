package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignment_4 {
	static void readExcel(ArrayList<Check> arr){
		try {
			ArrayList<String> storage = new ArrayList<String>(5);
			File f = new File("D:\\Excel\\exercise.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			for(int i = 2;i<4;i++){
				XSSFSheet sh = wb.getSheet("Sheet1");
				XSSFRow row = sh.getRow(i);
				for(int j = 1;j<4;j++){
					XSSFCell cell = row.getCell(j);
					storage.add(cell.getStringCellValue());
				}
				Check obj = new Check(storage.get(0),storage.get(1),storage.get(2));
				storage.remove(2);
				storage.remove(1);
				storage.remove(0);
				arr.add(obj);
			}
			wb.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	static void writeExcel(ArrayList<Check> arr){
		try {
			File f = new File("D:\\Excel\\exercise.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb;
			wb = new XSSFWorkbook(fis);
			for(int i=2;i<4;i++){
				FileOutputStream fos = new FileOutputStream(f);
				XSSFSheet sh_prime = wb.getSheet("sheet1");
				XSSFRow row = sh_prime.getRow(i);
				XSSFCell Avg = row.createCell(4);
				XSSFCell Grade = row.createCell(5);
				Check obj = arr.get(i-2);
				Avg.setCellValue(obj.Actual);
				Grade.setCellValue(obj.Result);
				wb.write(fos);
			}
			wb.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void testCase(Check obj) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys(obj.UserId);
		dr.findElement(By.id("Password")).sendKeys(obj.Password);
		dr.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		String str = dr.findElement(By.className("account")).getText();
		obj.Actual = str;
		if(str.equals(obj.Expected)) {
			System.out.println("Pass");
			obj.Result = "PASS";
		}
		else {
			System.out.println("Fail");
			obj.Result = "FAIL";
		}
		dr.close();
	}
	
	public static void main(String args[]) {
		ArrayList<Check> arr = new ArrayList<Check>();
		readExcel(arr);
		testCase(arr.get(0));
		testCase(arr.get(1));
		writeExcel(arr);
		//Check obj = arr.get(1);
		//System.out.println(obj.UserId);
	}
}
