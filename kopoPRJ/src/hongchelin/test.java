package hongchelin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	public static void main(String[] args) {
		
		
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		
		driver.get("https://map.naver.com/v5/search/%EA%B0%80%EB%A1%9C%EC%88%98%EA%B8%B8%20%EB%A7%9B%EC%A7%91?c=14139679.7700594,4511794.8855255,15,0,0,0,dh");
		
		driver.switchTo().frame(driver.findElement(By.id("searchIframe")));
		
		stunGun(1000);
		
		//드롭다운 리뷰 많은 순 클릭
		 driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/div/div/span[2]")).click();
        
        stunGun(1000);
        
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/ul/li[5]/a")).click();
        
        stunGun(1000);
        
        int count =0;
        int pageCount =3;
		for (int i=1;i<=11;i++) {
			
			if (i%11==0) {
				
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/a["+pageCount+"]")).click();
				stunGun(2000);
				i=1;
				pageCount++;
				
				
			}
		
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/ul/li["+i+"]/div[1]/a/div[1]/div/span")).click();//가게
		
		stunGun(1000);
		
		driver.switchTo().defaultContent();
		
		stunGun();
		
		driver.switchTo().frame(driver.findElement(By.id("entryIframe")));
		
		stunGun();
		
		if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[2]/span")).getText().contains("메뉴")) {
            
           
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[2]/span")).click();//메뉴 진입
         } else {                  
            
           
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/div/div/div/div/a[3]/span")).click();//메뉴 진입
		}
		
		stunGun();
		
	  /*/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[1]/div/span[1]
		/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[1]/a/div[2]/div[1]/div/span[1]
		/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[1]/div/span[1]
		/html/body/div/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/div/a/div/div[1]
		/html/body/div[3]/div/div/div/div[5]/div/div[1]/div/ul/li[1]/a/div[2]/div[1]/div/span
		/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[1]/a/div[2]/div[1]/div/span[1]
		/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[1]/a/div/div[1]/div/span[1]*/
		try {
		String tt =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div[1]/ul/li[1]/a/div[2]/div[1]/div/span[1]")).getText();//새들러
		System.out.println(tt);
		Thread.sleep(500);
		} catch (Exception e1) {
			try {
				String tt =  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/div/a/div/div[1]")).getText();
				System.out.println(tt);
				Thread.sleep(500);
			} catch (Exception e2) {
				try {
					String tt =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[5]/div/div[1]/div/ul/li[1]/a/div[2]/div[1]/div/span")).getText();
					System.out.println(tt);
					Thread.sleep(500);
				} catch (Exception e3) {
					try {
						String tt =  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div[2]/div[1]/ul/li[1]/div/a/div[2]/div[1]")).getText();
						System.out.println(tt);
						Thread.sleep(500);
					} catch (Exception e4) {
						try {
							String tt =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/div/ul/li[1]/a/div/div[1]/div/span[1]")).getText();//벤스
							System.out.println(tt);
							Thread.sleep(500);
						} catch (Exception e5) {
							
						}
					}
				}
			}
		}
		driver.switchTo().defaultContent();
		stunGun();
		driver.switchTo().frame(driver.findElement(By.id("searchIframe")));
		stunGun();
		count++;
//		/html/body/div[3]/div/div[2]/div[2]/a[3]
//		/html/body/div[3]/div/div[2]/div[2]/a[4]
//		/html/body/div[3]/div/div[2]/div[2]/a[5]
//		/html/body/div[3]/div/div[2]/div[2]/a[5]
//		/html/body/div[3]/div/div[2]/div[2]/a[6]
		
		
		}
		
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
}
