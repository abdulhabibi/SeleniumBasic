package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOpenChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kahoot.it/v2//");
		String actualPageTitle = driver.getTitle();
		System.out.println("This is current page Titile " + actualPageTitle);
		String currentURL = driver.getCurrentUrl();
		System.out.println("This is current page url " + currentURL);
		driver.close();

	}

}