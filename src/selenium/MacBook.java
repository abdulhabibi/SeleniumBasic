package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacBook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		// creating object of the chromedriver
		WebDriver driver = new ChromeDriver();
		// setting the implicit timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// maximazing the window
		driver.manage().window().maximize();
		// going to the url or link
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		
		WebElement macBook = driver.findElement(By.linkText("MacBook"));
		macBook.click();
		
		WebElement qty = driver.findElement(By.id("input-quantity"));
		qty.clear();
		qty.sendKeys("5");
		
		WebElement addToCard = driver.findElement(By.id("button-cart"));
		addToCard.click();
		
		//driver.navigate().back();
		
		WebElement home = driver.findElement(By.partialLinkText("TEST ENVIRONMENT"));
		home.click();
		
		WebElement iphone =  driver.findElement(By.linkText("iPhone"));
		iphone.click();
		
		WebElement QTY = driver.findElement(By.id("input-quantity"));
		QTY.clear();
		QTY.sendKeys("8");
		
		WebElement toCart = driver.findElement(By.id("button-cart"));
		toCart.click();
		
		WebElement total = driver.findElement(By.id("cart-total"));
		total.click();
		
		String rawTotal = driver.findElement(By.id("cart-total")).getText();
		System.out.println(rawTotal);
		
		String cleanTotal = rawTotal.substring(rawTotal.indexOf("$")).replace("$", "").replace(",", "");
		double finaltotal = Double.valueOf(cleanTotal);
		System.out.println("Your total is $" + finaltotal + " and your 10% tax will be $" + finaltotal * 0.1);
		
	}

}
