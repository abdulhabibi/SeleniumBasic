package Amazon;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAutomation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// creating the instance of the JS
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// creating an instance of the webdriverwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// going to the website
		driver.get("https://www.amazon.com/");

		WebElement searchBox = driver.findElement(By.xpath("//*[@id = 'twotabsearchtextbox']"));

		searchBox.sendKeys("Java Illuminated");

		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();

		driver.findElement(By.xpath("//a//span[contains(text(), '3rd Revised edition')]")).click();

		WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-button"));
		addToCartBtn.click();

		driver.findElement(By.xpath("(//a[@class = 'a-button-text'])[3]")).click();
		
		WebElement orginNum = driver.findElement(By.xpath("//span[@class = 'a-button-text a-declarative']"));

		orginNum.clear();
		List<WebElement> quantity = driver.findElements(By.xpath("//a[@class = 'a-dropdown-link']"));

		for (int i = 0; i < quantity.size(); i++) {
			System.out.println(quantity.get(i));
		}
	}

}
