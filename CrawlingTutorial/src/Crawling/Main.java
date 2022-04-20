//1. 프로젝트의 properties에서 classpath에 selenium jar파일 적용하기.
package Crawling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	//기본 설정문1
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	

	public static void main(String[] args) {
		String text;
		
		//기본 설정문2
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://vibe.naver.com");

		// 3000ms 쉬기, 그리고 surround with try catch
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// html에서 가리키는 클릭해야할 버튼의 full xpath복붙
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/a[2]")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div[2]/span/input")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// senKeys()는 키보드입력
		driver.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div[2]/span/input")).sendKeys("다비치");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//getText 해당 텍스트 가져오기(항상 검사는 두번!!)
		text = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/span[1]/a/span")).getText();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(text);
	}

}
