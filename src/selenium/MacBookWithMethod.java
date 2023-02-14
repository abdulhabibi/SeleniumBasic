package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacBookWithMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		// creating object of the chromedriver
		WebDriver driver = new ChromeDriver();
		// setting the implicit timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// maximazing the window
		driver.manage().window().maximize();
		// going to the url or link
		String homePageURL = "http://tek-school.com/retail/index.php?route=common/home";
		driver.get(homePageURL);

		addItemsToCart(driver, "MacBook", 5, homePageURL);
		addItemsToCart(driver, "iPhone", 5, homePageURL);
		
		String rawTotal = driver.findElement(By.id("cart-total")).getText();
		System.out.println(rawTotal);
		
		String cleanTotal = rawTotal.substring(rawTotal.indexOf("$")).replace("$", "").replace(",", "");
		double total = Double.valueOf(cleanTotal);
		System.out.println("Your total is $" + total + " and your 10% tax will be $" + total * 0.1);
	}

	public static void addItemsToCart(WebDriver driver, String item, int quantity, String homePageURL) {
		if (driver.findElement(By.linkText(item)).isDisplayed()) {// checking to see if the items is displayed on the
																	// page
			driver.findElement(By.linkText(item)).click(); // now that we know the is displayed , we click on it

			driver.findElement(By.id("input-quanity")).clear(); // clear the value from the quantity

			driver.findElement(By.id("input-quantiy")).sendKeys(String.valueOf(quantity)); // convert the int quantity
																							// to string and send it to
																							// the box
			driver.findElement(By.id("button-cart")).click(); // clicking on add to cart button
			driver.navigate().to(homePageURL);
			;// going back to home page

		} else {
			System.out.println("Item not found");
		}
	}
}
