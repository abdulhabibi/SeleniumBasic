package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserTestingExamples {

	public static void main(String[] args) {

		// Setting the properties instead of changing the browsers on the Webdriver object
		String driver_to_Use = "ie";
		WebDriver driver;

		if (driver_to_Use.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (driver_to_Use.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else if (driver_to_Use.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else{
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/index.php?route=product/product&product_id=42");

		
	}

}
