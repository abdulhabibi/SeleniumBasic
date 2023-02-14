package selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// step 1. To open a chrome browser we need to setup
		// system.SetProperty to open chromedriver file.
		// Syntax for system.setProperty("webdriver.chrome.driver","<path to file>
		// for Windows users we will add ".exe" extension for mac users we do not add
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// Step2 we need to create a reference to Webdriver Interface
		// then Create Obj of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		// we need to open http://tek-school.com/retail/
		// In order to open a website with selenium webdriver. we need to use
		// .get() method and pass url as a parameter
		// we can maximize the page
		driver.manage().window().maximize();
		// we need to define the pageload timeout so webdriver should not throw an
		// exception for this issue.
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// GLobal wait or Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Delete Cookies with Selenium
		// driver.manage().deleteAllCookies();
		// .get will open website url
		driver.get("http://tek-school.com/retail/");
		// to close an opened browser with Webdriver we can use two methods
		// .close() -- this method will close the only tab opened in browser
		// .quite() -- this method will close all opened tab in a browser
		String actualPageTitle = driver.getTitle();
		System.out.println("This is current page Titile " + actualPageTitle);
		String currentURL = driver.getCurrentUrl();
		System.out.println("This is current page url " + currentURL);

		driver.close();
	}

}
