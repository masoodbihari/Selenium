package day6;

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


public class excel_io_test_data {
	String UserId;
	String Password;
	String Expected;
	String Actual;
	String Result;
	static void readExcel(ArrayList<excel_io_test_data> arr) {
		try {
			ArrayList<String> storage = new ArrayList<String>(3);
			File f = new File("D:\\Excel\\check2.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			for(int i = 2;i<6;i++){
				XSSFSheet sh = wb.getSheet("Sheet1");
				XSSFRow row = sh.getRow(i);
				excel_io_test_data obj = new excel_io_test_data();
				for(int j = 1;j<4;j++){
					XSSFCell cell = row.getCell(j);
					storage.add(cell.getStringCellValue());
				}
				
				obj.UserId = storage.get(0);
				obj.Password = storage.get(1);
				obj.Expected = storage.get(2);
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
	static void writeExcel(ArrayList<excel_io_test_data> arr){
		try {
			File f = new File("D:\\Excel\\check2.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			for(int i=2;i<6;i++){
				FileOutputStream fos = new FileOutputStream(f);
				XSSFSheet sh_prime = wb.getSheet("sheet1");
				XSSFRow row = sh_prime.getRow(i);
				XSSFCell Avg = row.getCell(4);
				XSSFCell Grade = row.getCell(5);
				excel_io_test_data obj = arr.get(i-2);
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
}
