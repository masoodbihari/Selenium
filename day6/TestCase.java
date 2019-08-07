package day6;

import java.util.ArrayList;

public class TestCase {
	public static void main(String args[]) {
		ArrayList<excel_io_test_data> arr = new ArrayList<excel_io_test_data>();
		excel_io_test_data.readExcel(arr);
		check_test_cases.test(arr);
		excel_io_test_data.writeExcel(arr);
	}
}
