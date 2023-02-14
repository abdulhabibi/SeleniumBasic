package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExamples {

	public static void main(String[] args) {
		// setting the property and defining web driver
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		// creating object of the chromedriver
		WebDriver driver = new ChromeDriver();
		// setting the implicit timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// maximazing the window
		driver.manage().window().maximize();
		// going to the url or link
		driver.get("http://tek-school.com/retail/index.php?route=common/home");

		// creating object of web element
		// Canon EOS 5D Camera
		WebElement canon = driver.findElement(By.linkText("Canon EOS 5D Camera"));
		canon.click();

		// creating an object of select to interact with the drop down on the page
		Select dropdown = new Select(driver.findElement(By.id("input-option226")));
		dropdown.selectByIndex(1);

		// creat element of the quantity text box
		WebElement QTY = driver.findElement(By.id("input-quantity"));
		// clear the existing value
		QTY.clear();
		// enter the new value
		QTY.sendKeys("2");

		// create element of the add to car button and clicking on it
		WebElement addToCart = driver.findElement(By.id("button-cart"));
		addToCart.click();
		// checking to see if we can click on the cart button and trying to remove added
		// items
		WebElement items = driver.findElement(By.id("cart-total"));
		items.click();
		WebElement remove = driver.findElement(By.xpath("//button[@title='Remove']"));
		remove.click();

	}

}
