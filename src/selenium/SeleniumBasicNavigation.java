package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicNavigation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://tek-school.com/real-estate/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		System.out.println(driver.getPageSource());
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
