package hongchelin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	public static ArrayList<ArrayList<String>> hongchelinList = new ArrayList<ArrayList<String>>();

	public static void main(String[] args) throws InterruptedException, IOException {

		ArrayList<String> menu = new ArrayList<>();

		menu.add("Location");
		menu.add("Restaurant");
		menu.add("Star");
		menu.add("Address");
		menu.add("TEL");
		menu.add("PopMenu1");
		menu.add("Review1");
		menu.add("PopMenu2");
		menu.add("Review2");
		menu.add("PopMenu3");
		menu.add("Review3");
		menu.add("PopMenu4");
		menu.add("Review4");
		menu.add("PopMenu5");
		menu.add("Review5");

		hongchelinList.add(menu);

		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		getHongchelinData("Garosu-gil",
				"https://map.naver.com/v5/search/%EA%B0%80%EB%A1%9C%EC%88%98%EA%B8%B8%EB%A7%9B%EC%A7%91?c=14139679.7700594,4511794.8855255,15,0,0,0,dh");
		
		FileWriter fw = new FileWriter("C:\\Users\\501-01\\Desktop\\bbang0425\\hongchelinList.csv", true);
		for (int i = 0; i < hongchelinList.size(); i++) {
			String str = String.join(",", hongchelinList.get(i)) + "\n";
			fw.write(str);
		}
		fw.close();
	}

	public static void getHongchelinData(String city, String url) {
		String Restaurant;
		String StarRate = "";
		String StarPeople = "";
		String VisitReviewNum = "";
		String BlogReviewNum = "";
		String Address = "";
		String TEL = "";

		String Menu1 = "";
		String Price1 = "";
		String Menu2 = "";
		String Price2 = "";
		String Menu3 = "";
		String Price3 = "";

		String Title1 = "";
		String Title1Num = "";
		String Title2 = "";
		String Title2Num = "";
		String Title3 = "";
		String Title3Num = "";
		
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		driver.get(url);

		//뽑을 항목갯수
		int itemOfOnepages = 2;

		for (int i = 1; i < itemOfOnepages; i++) {

			stunGun();
			
			//사이드바 프레임 이동
			driver.switchTo().frame(driver.findElement(By.id("searchIframe")));
			
			stunGun();
			
			//가게 이름 가져오기			
			String nameUrl = "/html/body/div[3]/div/div[2]/div[1]/ul/li[1]/div[1]/a/div[1]/div/span[1]";		

			if (driver.findElement(By.xpath(nameUrl)).getText().equals(null)){
				System.out.println("null뜸");
				nameUrl = "/html/body/div[3]/div/div[2]/div[1]/ul/li["+i+"]/div[1]/a/div[1]/div/span";
						   
				Restaurant = driver.findElement(By.xpath(nameUrl)).getText();
			}else {
				System.out.println("null아님");
				Restaurant = driver.findElement(By.xpath(nameUrl)).getText();
			}
			
			
			Restaurant.replace(",", " ");
			
			stunGun();
			
			//가게 클릭
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/ul/li["+i+"]/div[1]/a/div[1]/div/span")).click();
			stunGun();
			
			//사이드바 프레임 이동
			driver.switchTo().defaultContent();
			stunGun();
			driver.switchTo().frame(driver.findElement(By.id("entryIframe")));
			stunGun();
			
			//@@@메인페이지@@@
			//별점 가져오기

			try {
				StarRate = driver.findElement(By.xpath(
						"/html/body/div[3]/div/div/div/div[2]/div[1]/div[2]/span[1]/em"))
						.getText();
				StarRate.replace(",", " ");
				System.out.println(StarRate);
			} catch (Exception e) {
				
			}
			stunGun();
			
			//방문자&블로그 리뷰 수 가져오기
			for (int j = 1; j < 3; j++) {
				try {
					VisitReviewNum = driver.findElement(By.xpath(
							"/html/body/div[3]/div/div/div/div[2]/div[1]/div[2]/span["+j+"]/a/em"))
							.getText();
					BlogReviewNum = driver.findElement(By.xpath(
							"/html/body/div[3]/div/div/div/div[2]/div[1]/div[2]/span["+(j+1)+"]/a/em"))
							.getText();
					VisitReviewNum.replace(",", "");
					BlogReviewNum.replace(",", "");
					break;
				} catch (Exception e) {
					
				}
			}
			
			System.out.println(VisitReviewNum);
			System.out.println(BlogReviewNum);
			stunGun();
			

			//주소 긁기
			for (int j = 1; j < 4; j++) {
					try {
						Address = driver.findElement(By.xpath(
								"/html/body/div[3]/div/div/div/div[5]/div/div[" + j + "]/div/ul/li[2]/div/a/span[1]"))
								.getText();
						System.out.println(Address);
						break;
					} catch (Exception e) {
						
					}
			}
			Address.replace(",", " ");
		
			stunGun();
			
			
			//전번 긁기
			for(int j = 1; j < 4; j++ ) {
				try {
					TEL = driver.findElement(By.xpath(
							"/html/body/div[3]/div/div/div/div[5]/div/div["+j+"]/div/ul/li[1]/div/span[1]"))
							.getText();
					System.out.println(TEL);
					break;
				} catch (Exception e) {
					
				}
			}
			TEL.replace(",", " ");
			
			stunGun();
			
			//@@@메뉴 페이지@@@
			//메뉴 클릭과 동시에 리뷰div 셋팅
			String ReviewPageUrl = "";
			
			if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[2]/span")).getText().contains("메뉴")) {
                driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[2]/span")).click();
                if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).getText().contains("예약")) {
                	ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[4]/span";
                }else {
                	//아예 별점이 없다면.
//                	if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).getText().contains("")) {
//                		/html/body/div/div[2]/div/header/div[2]/div/a[5]/span
//                	}else {
//                	//별점이 있다면
                		ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span";//네모오징어는 이 값이 null 그래서 no such element
//                	}
                	
                }
             } else {                  
                driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).click();
                if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[4]/span")).getText().contains("예약")) {
                	ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[5]/span";
                }else {
                	ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[4]/span";
                }
                
                
             }
			stunGun();
		
			
			//대표메뉴 가져오기
			
			
			
			
			
			//@@@리뷰 페이지@@@
			//리뷰 클릭
			
			driver.findElement(By.xpath(
					ReviewPageUrl)).click();
			stunGun();
			
			
			//별점 참여수 
			String StarPeopleStr = "";
			for (int j = 5; j < 7; j++) {
				try {
					StarPeople = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div["+j+"]/div[3]/div[1]/div/div/div[3]/span[2]")).getText();
					break;
				} catch (Exception e) {

				}

			}
		StarPeople.replace(",", " ");
		System.out.println(StarPeople);
		stunGun();
		
			
			
//			System.out.println(StarPeople);
			
			
			

			ArrayList<String> data1 = new ArrayList<>();
			data1.add(city);
			data1.add(Restaurant);
			data1.add(StarRate);
			data1.add(StarPeople);
			data1.add(VisitReviewNum);
			data1.add(BlogReviewNum);
			
			data1.add(Address);
			data1.add(TEL );
			data1.add(Menu1);
			data1.add(Price1);
			data1.add(Menu2);
			data1.add(Price2);
			data1.add(Menu3);
			data1.add(Price3);
			data1.add(Title1);
			data1.add(Title1Num);
			data1.add(Title2);
			data1.add(Title2Num);
			data1.add(Title3);
			data1.add(Title3Num);
			
			hongchelinList.add(data1);
//
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		}

		printData();
	}

	public static void stunGun() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void printData() {
		// print data

		for (int j = 0; j < hongchelinList.size(); j++) {
			for (int k = 0; k < hongchelinList.get(j).size(); k++) {
				System.out.print(hongchelinList.get(j).get(k));
				System.out.print(",");
				if (k == (hongchelinList.get(j).size()) - 1) {
					System.out.println();
				}
			}
		}
	}

}