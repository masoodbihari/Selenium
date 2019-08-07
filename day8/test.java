package day8;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {
	@Test(dataProvider="logindataprovider")
	public void  login(String eid,String pwd,String er) {
		System.out.println(eid + " " + pwd + " " + er);
		Assert.assertEquals("Girish", er);
	}
	
	@DataProvider(name="logindatprovider")
	public String[][] get_testdata(){
		String[][] logintestdata = {
				{"girishindia75@gmail.com","mynew95","Girish"},
				{"girishindia75@gmail.com","mynew95","Girish"}
		};
		return logintestdata;
	}
}
