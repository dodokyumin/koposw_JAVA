package bobedream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
   public static ArrayList<ArrayList<String>> encarList = new ArrayList<ArrayList<String>>();

   public static void main(String[] args) throws IOException {

      ArrayList<String> menu = new ArrayList<>();
      String companyType, carType, option, yearType, distance, fuel, price;
      menu.add("companyType");
      menu.add("carType");
      menu.add("option");
      menu.add("yearType");
      menu.add("distance");
      menu.add("fuel");
      menu.add("price");
      encarList.add(menu);

      try {
         System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      } catch (Exception e) {
         e.printStackTrace();
      }

      ChromeOptions options = new ChromeOptions();
      WebDriver driver = new ChromeDriver(options);

      driver.get(
            "https://www.bobaedream.co.kr/mycar/mycar_list.php?gubun=K&maker_no=8&group_no=106&page=1&order=S11&view_size=20");
      
      //찾아볼 다음 페이지 수 +1
      int setPages = 2;
      for( int h = 1; h < setPages; h++) {
         
         //한 페이지당 항목갯수 +1
         int itemOfOnepages = 13;
               
         for (int i = 1; i < itemOfOnepages; i++) {
   
//            companyType = driver.findElement(
//                  By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[3]/table/tbody/tr[" + i
//                        + "]/td[2]/a/span[1]/strong"))
//                  .getText();
////            if (companyType == "") {
////               break;
////            }
//            companyType = companyType.replace("(GM대우)","");

            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
   
//            carType = driver.findElement(
//                  By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[3]/table/tbody/tr[" + i
//                        + "]/td[2]/a/span[1]/em"))
//                  .getText();
//            
//            try {
//               Thread.sleep(500);
//            } catch (InterruptedException e) {
//               e.printStackTrace();
//            }
   
            option = driver.findElement(
                  By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/ul/li["+i+"]/div/div[2]/dl[1]/dd[2]/a"))
            
                  .getText();
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
   
            yearType = driver.findElement(
                  By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/ul/li["+i+"]/div/div[3]/span"))           		
                  .getText();
   
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
   
            distance = driver.findElement(
                  By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/ul/li["+i+"]/div/div[5]/span"))
                  .getText();
            distance = distance.replace(",","");
            
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
   
            fuel = driver.findElement(
                  By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/ul/li["+i+"]/div/div[4]/span")) 
                  .getText();
            
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
   
            price = driver.findElement(
                  By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/ul/li["+i+"]/div/div[6]/b/em"))
                  .getText();
            price = price.replace(",","");
            
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            
            ArrayList<String> data1 = new ArrayList<>();
//            data1.add(companyType);
//            data1.add(carType);
            data1.add(option);
            data1.add(yearType);
            data1.add(distance);
            data1.add(fuel);
            data1.add(price);
            encarList.add(data1);
            
         }
         
//         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[5]/span["+h+"]/a")).click();
         
         try {
            Thread.sleep(2000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         
      }
      printData();
      FileWriter fw = new FileWriter("C:\\Users\\501-01\\Desktop\\bobedream_chevrolet_Damas.csv",true);
      for (int i = 0; i < encarList.size(); i++) {
         String str = String.join(",", encarList.get(i)) + "\n";
         fw.write(str);
      }
      fw.close();

   }

   public static void printData() {
      // print data
    
      for (int j = 0; j < encarList.size(); j++) {
         for (int k = 0; k < encarList.get(j).size(); k++) {
            System.out.print(encarList.get(j).get(k));
            System.out.print(",");
            if (k == (encarList.get(j).size()) - 1) {
               System.out.println();
            }
         }
      }
   }
   

}