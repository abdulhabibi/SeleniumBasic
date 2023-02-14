package ExampleAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parcatice_01_19_2021 {
	public static void main(String[] args) {
		// setting the property and defining where web driver is
		System.setProperty("webDriver.chrome.driver", "c:\\chromedriver.exe");
		// creating an object of the Chromedrvier
		WebDriver driver = new ChromeDriver();
		// setting the implicit timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// maximizing the window
		driver.manage().window().maximize();
		// going to the link
		String HomePageURL = "http://tek-school.com/retail/index.php?route=common/home";
		driver.get(HomePageURL);
		// Go MacBook page, add 5 of that item to the cart
		// Then go back to the homepage
		// Go to the iPhone page, add 8 iphones to the cart
		addItemsToTheCart(driver, "MacBook", 5);
		addItemsToTheCart(driver, "iPhone", 8);
		addItemsToTheCart(driver, "MacBook", 2);

		String rawTotal = driver.findElement(By.id("cart-total")).getText();
		System.out.println(rawTotal);

		String cleanTotal = rawTotal.substring(rawTotal.indexOf("$")).replace("$", "").replace(",", "");
		double total = Double.valueOf(cleanTotal);
		System.out.println("Your total is $" + total + " and your 10% tax will be $" + (total * 0.1));

		// Check the total value in the cart
		// Separate the number of the total and calculate the 10% tax for that item
		// Print a message in the console
		// “Your total is $$$$$$ and your 10% tax will be $$$
	}

	public static void addItemsToTheCart(WebDriver driver, String item, int quantity) {
		if (driver.findElement(By.linkText(item)).isDisplayed()) { // checking to see if the item is displayed on the
																	// page
			driver.findElement(By.linkText(item)).click(); // now that we know the item is displayed, we click on it
			driver.findElement(By.id("input-quantity")).clear(); // clear the value form the quantity
			driver.findElement(By.id("input-quantity")).sendKeys(String.valueOf(quantity)); // convert the int quantity
																							// to string and send it to
																							// the box
			driver.findElement(By.id("button-cart")).click(); // clicking on the add to cart btn
			driver.findElement(By.id("button-cart")).click(); // clicking on the add to cart btn
			driver.findElement(By.linkText("TEST ENVIRONMENT")).click();

		} else {
			System.out.println("item not found"); // item not found
		}
	}
}