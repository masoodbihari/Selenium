package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_6 {
    static double gtotal=0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] quantity= new int[3];
        System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("http://examples.codecharge.com/Store/Default.php");
        
         for(int i=1,j=-1;i<=5;i=i+2)
         {
             String qty =""+i;
             AddToCart(dr,i, qty);
             quantity[++j]=i;
         }
        dr.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[3]")).click();
        
        for(int i=2, j=0;i<=4;i++,j++)
            check(dr, i, quantity[j]);
        
        
        String abd = dr.findElement(By.tagName("p")).getText();
        abd= abd.substring(8);
        double sum = Double.parseDouble(abd);
        System.out.println(sum);
        if(sum==gtotal)
        System.out.println("Verified Grand total");
        
        dr.close();
    }

    public static void AddToCart(WebDriver dr, int row, String qty)
    {
        
         dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[2]/tbody/tr[1]/td/a")).click();
         String str = "/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr["+row+"]/td[2]/b/a";
         dr.findElement(By.xpath(str)).click();
         dr.findElement(By.name("quantity")).clear();
         dr.findElement(By.name("quantity")).sendKeys(qty);
         
         dr.findElement(By.name("Insert1")).click();
         dr.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
    }
    public static void check(WebDriver dr, int row, int quantity)
    {
        
        String price= dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+row+"]/td[2]")).getText();
        price = price.substring(1);
        double price1 = Double.parseDouble(price);
        //double qty = Double.parseDouble(quantity);
        
        double total = price1*quantity;
         System.out.println();
         System.out.println(total);
        
         String ttl= dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+row+"]/td[4]")).getText();
         ttl = ttl.substring(1);
            //System.out.print(price);
            double tyl = Double.parseDouble(ttl);
        System.out.print(tyl);
        if(tyl==total)
        System.out.println("Verified");
        else
            System.out.print("not Verified");
        
         gtotal= total+gtotal;
        
    }
}