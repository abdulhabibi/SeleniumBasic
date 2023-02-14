package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/index.php?route=common/home");

		// CSS selector and its syntax are;
		// 1. ids with #tag (span#cart-total)
		// 2. class with (.) span.cart-total
		// 3. span[id='cart-total']
		// if there is more type by index so you can use; nth-of-type(index), by the way
		// the index start 1 in the paths

		WebElement cartTotal = driver.findElement(By.cssSelector("div#search>input"));
		cartTotal.sendKeys("Canon");
		System.out.println(cartTotal.getText());
//		System.out.println(cartTotal.getLocation());
	}

}
