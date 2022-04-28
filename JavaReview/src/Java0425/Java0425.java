package Java0425;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Java0425 {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	public static ArrayList<ArrayList<String>> BangList = new ArrayList<ArrayList<String>>();

	public static void main(String[] args) throws InterruptedException, IOException {

		ArrayList<String> menu = new ArrayList<>();
		String location, postName, postDate;
		menu.add("location");
		menu.add("postName");
		menu.add("postDate");

		BangList.add(menu);

		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		getBangData("Seoul",
				"https://search.naver.com/search.naver?sm=tab_hty.top&where=view&query=%EC%84%9C%EC%9A%B8+%EB%B9%B5%EC%A7%91&oquery=%EC%84%9C%EC%9A%B8+%EB%B9%B5%EC%A7%91&tqi=hEhP2lprvhGssAPPyZNssssssms-067611&nso=so%3Ar%2Cp%3A1y%2Ca%3Aall&mode=image");
		getBangData("Gyeonggi",
				"https://search.naver.com/search.naver?sm=tab_hty.top&where=view&query=%EA%B2%BD%EA%B8%B0+%EB%B9%B5%EC%A7%91&oquery=%EC%84%9C%EC%9A%B8+%EB%B9%B5%EC%A7%91&tqi=hEhl9wp0YidssLtSnGsssssstDh-353658&nso=so%3Ar%2Cp%3A1y%2Ca%3Aall&mode=image");
		getBangData("Busan",
				"https://search.naver.com/search.naver?sm=tab_hty.top&where=view&query=%EB%B6%80%EC%82%B0+%EB%B9%B5%EC%A7%91&oquery=%EA%B2%BD%EA%B8%B0+%EB%B9%B5%EC%A7%91&tqi=hEhmTwp0Jywss62rcdKssssssFN-456734&nso=so%3Ar%2Cp%3A1y%2Ca%3Aall&mode=image");

		FileWriter fw = new FileWriter("C:\\Users\\501-01\\Desktop\\bbang0425\\BangList.csv", true);
		for (int i = 0; i < BangList.size(); i++) {
			String str = String.join(",", BangList.get(i)) + "\n";
			fw.write(str);
		}
		fw.close();
	}

	public static void getBangData(String city, String url) {
		String location;
		String postName;
		String postDate;
		location = city;
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		driver.get(url);

		//»ÌÀ» Ç×¸ñ°¹¼ö
		int itemOfOnepages = 50;

		for (int i = 1; i < itemOfOnepages; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			postName = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[4]/a"))
					.getText();
			postName.replace(",", " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			postDate = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[1]/a/div[2]/span"))
					.getText();
			postDate.replace(",", " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			ArrayList<String> data1 = new ArrayList<>();
			data1.add(location);
			data1.add(postName);
			data1.add(postDate);
			BangList.add(data1);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		}

		printData();
	}

	public static void printData() {
		// print data

		for (int j = 0; j < BangList.size(); j++) {
			for (int k = 0; k < BangList.get(j).size(); k++) {
				System.out.print(BangList.get(j).get(k));
				System.out.print(",");
				if (k == (BangList.get(j).size()) - 1) {
					System.out.println();
				}
			}
		}
	}

}