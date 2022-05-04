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
import java.util.NoSuchElementException;

public class itaewon {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	public static ArrayList<ArrayList<String>> hongchelinList = new ArrayList<ArrayList<String>>();

	public static void main(String[] args) throws InterruptedException, IOException {

		ArrayList<String> menu = new ArrayList<>();

		menu.add("Location");
		menu.add("Restaurant");
		menu.add("StarRate");
		menu.add("StarPeople");
		menu.add("VisitReview");
		menu.add("BlogReview");
		menu.add("Address");
		menu.add("TEL");
		menu.add("PopMenu1");
		menu.add("Price1");
		menu.add("PopMenu2");
		menu.add("Price2");
		//menu.add("PopMenu3");
		//menu.add("Price3");
		menu.add("Title1");
		menu.add("Title1Num");
		menu.add("Title2");
		menu.add("Title2Num");
		menu.add("Title3");
		menu.add("Title3Num");
		hongchelinList.add(menu);

		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		getHongchelinData("Garosu-road",
				"https://map.naver.com/v5/search/%EA%B0%80%EB%A1%9C%EC%88%98%EA%B8%B8%20%EB%A7%9B%EC%A7%91?c=14139212.7847955,4511794.8855255,15,0,0,0,dh");
//		getHongchelinData("Itaewon",
//				"https://map.naver.com/v5/search/%EC%9D%B4%ED%83%9C%EC%9B%90%20%EB%A7%9B%EC%A7%91?c=14136268.9074657,4513960.4486857,15,0,0,0,dh");
//		getHongchelinData("Seoul-forest",
//				"https://map.naver.com/v5/search/%EC%84%9C%EC%9A%B8%EC%88%B2%20%EB%A7%9B%EC%A7%91?c=14141617.4193801,4515158.5023329,15,0,0,0,dh");
//		getHongchelinData("Seochon",
//				"https://map.naver.com/v5/search/%EC%84%9C%EC%B4%8C%20%EB%A7%9B%EC%A7%91?c=14132203.7534328,4520289.1039361,14,0,0,0,dh");
//		getHongchelinData("Jong-no",
//				"https://map.naver.com/v5/search/%EC%A2%85%EB%A1%9C%20%EB%A7%9B%EC%A7%91?c=14134476.9308307,4518962.2747710,14,0,0,0,dh");
//		getHongchelinData("Hongdae",
//				"https://map.naver.com/v5/search/%ED%99%8D%EB%8C%80%20%EB%A7%9B%EC%A7%91?c=14128353.6575242,4516221.3776633,15,0,0,0,dh");
//		getHongchelinData("Yeonnam-dong",
//				"https://map.naver.com/v5/search/%EC%97%B0%EB%82%A8%EB%8F%99%20%EB%A7%9B%EC%A7%91?c=14127962.6478128,4518085.7735547,15,0,0,0,dh");
//		getHongchelinData("Yeouido",
//				"https://map.naver.com/v5/search/%EC%97%AC%EC%9D%98%EB%8F%84%20%EB%A7%9B%EC%A7%91?c=14128786.1894057,4513005.4508569,15,0,0,0,dh");
//		getHongchelinData("Songridan-gil",
//				"https://map.naver.com/v5/search/%EC%86%A1%EB%A6%AC%EB%8B%A8%EA%B8%B8%20%EB%A7%9B%EC%A7%91?c=14148833.2266969,4510410.2765785,15,0,0,0,dh");
//		getHongchelinData("Hyehua-station",
//				"https://map.naver.com/v5/search/%EB%8C%80%ED%95%99%EB%A1%9C%20%EB%A7%9B%EC%A7%91?c=14137019.8353547,4520654.9684271,15,0,0,0,dh");
//		getHongchelinData("Wangsimni",
//				"https://map.naver.com/v5/search/%EC%99%95%EC%8B%AD%EB%A6%AC%20%EB%A7%9B%EC%A7%91?c=14139916.7358595,4518065.4102750,15,0,0,0,dh");
//		getHongchelinData("Gangnam-station",
//				"https://map.naver.com/v5/search/%EA%B0%95%EB%82%A8%EC%97%AD%20%EB%A7%9B%EC%A7%91?c=14139717.0732208,4508743.9895023,15,0,0,0,dh");
//		getHongchelinData("Sadang-station",
//				"https://map.naver.com/v5/search/%EC%82%AC%EB%8B%B9%EC%97%AD%20%EB%A7%9B%EC%A7%91?c=14134567.9122505,4505744.9559912,15,0,0,0,dh");
//		getHongchelinData("Seohyun-station",
//				"https://map.naver.com/v5/search/%EC%84%9C%ED%98%84%EC%97%AD%20%EB%A7%9B%EC%A7%91?c=14149446.8308621,4492906.6708603,14,0,0,0,dh");
//		
		
		
		FileWriter fw = new FileWriter("C:\\Users\\501-01\\Desktop\\hongchelinStar\\itaewon.csv", true);
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
		//String Menu3 = "";
		//String Price3 = "";

		String Title1 = "";
		String Title1Num = "";
		String Title2 = "";
		String Title2Num = "";
		String Title3 = "";
		String Title3Num = "";
		
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		
		driver.get(url);
		
		//사이드바 프레임 이동
		driver.switchTo().frame(driver.findElement(By.id("searchIframe")));
		
		stunGun();
		
		//드롭다운 리뷰 많은 순 클릭
		 driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/div/div/span[2]")).click();
        
        stunGun();
        
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/ul/li[5]/a")).click();
        stunGun();
        
        int count=0;
        int pageCount=3;
        
		//뽑을 항목갯수
		int itemOfOnepages = 11;

		for (int i = 1; i <= itemOfOnepages; i++) {
			
				if (i%11==0) {
				
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/a["+pageCount+"]")).click();
				stunGun(2000);
				i=1;
				pageCount++;			
				}
			
			stunGun();
		
			//가게 클릭
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/ul/li["+i+"]/div[1]/a/div[1]/div/span")).click();
	
			stunGun();
			
			
			
			//사이드바2 프레임 이동
			driver.switchTo().defaultContent();
			stunGun();
			driver.switchTo().frame(driver.findElement(By.id("entryIframe")));
			stunGun();
			
			
			//가게 이름 가져오기
			Restaurant = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div[1]/span[1]")).getText();
			Restaurant.replace(",", " ");
			System.out.println(Restaurant);
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
				StarRate="별점없음";
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
					
					break;
				} catch (Exception e) {
					
				}
			}
			VisitReviewNum.replace(",", "");
			BlogReviewNum.replace(",", "");
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
                
                if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).getText().contains("리뷰")) {
                	ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span";
                }else {
                	//아예 별점이 없다면.
//                	if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).getText().contains("")) {
//                		/html/body/div/div[2]/div/header/div[2]/div/a[5]/span
//                	}else {
//                	//별점이 있다면
                		ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[4]/span";//네모오징어는 이 값이 null 그래서 no such element
//                	}
                	
                }
                driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[2]/span")).click();//메뉴 진입
             } else {                                 
                if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[4]/span")).getText().contains("리뷰")) {
                	ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[4]/span";
                }else {
                	ReviewPageUrl = "/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[5]/span";             	
                }
                driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).click();//메뉴 진입
               /* /html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[5]
                /html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[5]/span
                /html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[5]/span/text()*/
               // /html/body/div/div[2]/div/header/div[2]/div/a[5]/span
			}
			stunGun();

			// 대표메뉴 3개까지 가져오기
		
			try {
				Menu1 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[1]/div/span[1]")).getText();//새들러
				Price1 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[3]")).getText();//새들러
				Menu2 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[2]/a/div[2]/div[1]/div/span[1]")).getText();//새들러
				Price2 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[2]/a/div[2]/div[3]")).getText();//새들러
				System.out.println(Menu1);
				System.out.println(Price1);
				System.out.println(Menu2);
				System.out.println(Price2);
				System.out.println("1");
				Thread.sleep(500);
				} catch (Exception e1) {
					try {
						Menu1 =  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/div/a/div/div[1]")).getText();//어썸
						Price1 =  driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div[2]/div[2]/div/ul/li[1]/div/a/div/div[3]")).getText();//어썸
						Menu2 =  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div[2]/div/ul/li[2]/div/a/div/div[1]")).getText();//어썸
						Price2 =  driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div[2]/div[2]/div/ul/li[2]/div/a/div/div[3]")).getText();//어썸
						System.out.println(Menu1);
						System.out.println(Price1);
						System.out.println(Menu2);
						System.out.println(Price2);
						System.out.println("2");
						Thread.sleep(500);
					} catch (Exception e2) {
						try {
							Menu1 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[5]/div/div[1]/div/ul/li[1]/a/div[2]/div[1]/div/span")).getText();
							System.out.println(Menu1);
							System.out.println("3");
							Thread.sleep(500);
						} catch (Exception e3) {
							try {
								Menu1 =  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div[2]/div[1]/ul/li[1]/div/a/div[2]/div[1]")).getText();
								System.out.println(Menu1);
								System.out.println("4");
								Thread.sleep(500);
							} catch (Exception e4) {
								try {
									Menu1 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[1]/a/div/div[1]/div/span[1]")).getText();//벤스
									Price1 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[1]/a/div/div[3]")).getText();//벤스
									Menu2 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[2]/a/div/div[1]/div/span[1]")).getText();//벤스
									Price2 =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[2]/a/div/div[3]")).getText();//벤스
									System.out.println(Menu1);
									System.out.println(Price1);
									System.out.println(Menu2);
									System.out.println(Price2);
									System.out.println("5");
									Thread.sleep(500);
								} catch (Exception e5) {
									
								}
							}
						}
					}
				}
			
			
			
			
			
			/*
				if (driver.findElements(By.xpath(
						"/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[1]/div/span[2]/span")).isEmpty()) {
					Menu1 = "";
					Price1 ="";
				}else {
					Menu1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[1]/div/span[1]")).getText();
					Price1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[3]")).getText();
				}
				if (driver.findElements(By.xpath(
						"/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[2]/a/div[2]/div[1]/div/span[2]/span")).isEmpty()) {
					Menu2 = "";
					Price2 = "";
				}else {
					Menu2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[2]/a/div[2]/div[1]/div/span[1]")).getText();
					Price2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[2]/a/div[2]/div[3]")).getText();
				}
				
				if (driver.findElements(By.xpath(
						"/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[3]/a/div[2]/div[1]/div/span[2]/span")).isEmpty()) {
					Menu3 = "";
					Price3= "";
				}else {
					Menu3 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[3]/a/div[2]/div[1]/div/span")).getText();
					Price3 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[3]/a/div[2]/div[3]")).getText();
				}
			
			
			
				
				System.out.println(Menu1);
				System.out.println(Price1);
				System.out.println(Menu2);
				System.out.println(Price2);
				System.out.println(Menu3);
				System.out.println(Price3);*/
				stunGun();
			
			
			
			
			// @@@리뷰 페이지@@@
			// 리뷰 클릭
			try {
			driver.findElement(By.xpath(ReviewPageUrl)).click();
			} catch (Exception e){
				driver.findElement(By.xpath("/html/body/div/div[2]/div/header/div[2]/div/a[5]/span")).click();
			}
			stunGun();
			
					
			// 별점 참여수
			String StarPeopleStr = "";
			if (!(StarRate.equals("별점없음"))) {
				for (int j = 3; j < 5; j++) {
					try {
						StarPeopleStr = driver.findElement(By.xpath(
								"/html/body/div[3]/div/div/div/div[6]/div[" + j + "]/div[1]/div/div/div[3]/span[2]"))
								.getText();
						StarPeopleStr.replace(",","");
						StarPeople = StarPeopleStr.substring(0, StarPeopleStr.indexOf("개"));
						System.out.println(StarPeople);
						break;
					} catch (Exception e) {

					}

				}
			
			
			}
			stunGun();
			
			for (int indexR = 1; indexR < 11; indexR++) {
				try {

					Title1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[" + indexR
							+ "]/div[1]/div/div/div[2]/ul/li[1]/div[2]/span[1]")).getText();
					Title1Num = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[" + indexR
							+ "]/div[1]/div/div/div[2]/ul/li[1]/div[2]/span[2]")).getText();
					Title1Num = Title1Num.replace("이 키워드를 선택한 인원\n", "");
					
					Title2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[" + indexR
							+ "]/div[1]/div/div/div[2]/ul/li[2]/div[2]/span[1]")).getText();
					Title2Num = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[" + indexR
							+ "]/div[1]/div/div/div[2]/ul/li[2]/div[2]/span[2]")).getText();
					Title2Num = Title2Num.replace("이 키워드를 선택한 인원\n", "");
					
					Title3 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[" + indexR
							+ "]/div[1]/div/div/div[2]/ul/li[3]/div[2]/span[1]")).getText();
					Title3Num = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[" + indexR
							+ "]/div[1]/div/div/div[2]/ul/li[3]/div[2]/span[2]")).getText();
					Title3Num = Title3Num.replace("이 키워드를 선택한 인원\n", "");

				} catch (Exception e) {

				}
			}
			
			/*
			//한줄 리뷰 가져오기
			if (driver.findElements(By.xpath(
					"/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[1]/div[2]/span[1]")).isEmpty()) {
				Title1 = "";
				Title1Num ="";
			}else {
				Title1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[1]/div[2]/span[1]")).getText();
				Title1Num = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[1]/div[2]/span[2]")).getText();
				Title1Num = Title1Num.replace("이 키워드를 선택한 인원\n", "");
				
			}
			
			if (driver.findElements(By.xpath(
					"/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[2]/div[2]/span[1]")).isEmpty()) {
				Title2 = "";
				Title2Num = "";
			}else {
				Title2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[2]/div[2]/span[1]")).getText();
				Title2Num = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[2]/div[2]/span[2]")).getText();
				Title2Num = Title2Num.replace("이 키워드를 선택한 인원\n", "");
			}
			
			if (driver.findElements(By.xpath(
					"/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[3]/div[2]/span[1]")).isEmpty()) {
				Title3 = "";
				Title3Num= "";
			}else {
				Title3 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[3]/div[2]/span[1]")).getText();
				Title3Num = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div[3]/div[1]/div/div/div[2]/ul/li[3]/div[2]/span[2]")).getText();
				Title3Num = Title3Num.replace("이 키워드를 선택한 인원\n", "");
			}*/
			
			System.out.println(Title1);
			System.out.println(Title1Num);
			System.out.println(Title2);
			System.out.println(Title2Num);
			System.out.println(Title3);
			System.out.println(Title3Num);
			
		
			//크롤링 데이터 어레이리스트에 담기
			ArrayList<String> data1 = new ArrayList<>();
			data1.add(city);
			data1.add(Restaurant);
			data1.add(StarRate);
			data1.add(StarPeople.replace(",", ""));
			data1.add(VisitReviewNum.replace(",", ""));
			data1.add(BlogReviewNum.replace(",", ""));
			data1.add(Address.replace(",", ""));
			data1.add(TEL);
			data1.add(Menu1.replace(",", ""));
			data1.add((Price1.replace("원", "")).replace(",", ""));
			data1.add(Menu2.replace(",", ""));
			data1.add((Price2.replace("원", "")).replace(",", ""));
			//data1.add(Menu3.replace(",", ""));
			//data1.add((Price3.replace("원", "")).replace(",", ""));
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
			
			
			//사이드바1으로 프레임 이동
			driver.switchTo().defaultContent();
			stunGun();
			driver.switchTo().frame(driver.findElement(By.id("searchIframe")));
			stunGun();
			
			
			if (count ==50) {
				break;
			}
			count++;
			System.out.println(count);
	        
	        stunGun();
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
	
	public static void stunGun(int i) {
		try {
			Thread.sleep(i);
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