package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSExecutorExamples {
	
	//Note: if we are asked to find a dynamic drop-down: two ways
	//1. if it is a select tag, I would create an obj of the Select class and through select, I could 
	//select by index, value or text. 2. if it is not a select tag, I could  use find elements and store them in a list
	// I could loop through them and look for the option of the text I am looking for and select that item

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		//creating the instance of the JS
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//creating an instance of the webdriverwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// going to the website
		driver.get("https://www.aa.com/homePage.do");

		// finding the txt box element, clear and send keys
		WebElement originTxt = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));

		originTxt.clear();
		originTxt.sendKeys("wash");

		// find all of the elements that was suggested after I typed 'wash'
		List<WebElement> items = driver.findElements(By.xpath("//ul[@id = 'ui-id-1']//li/a"));
//
		for (int i = 0; i < items.size(); i++) {
			System.out.println(i + 1 + " " + items.get(i).getText());
		}
		
//		for (WebElement item : items ) {
//			if (item.getText().contains("Spokane International")) {
//				System.out.println(item.getText());
//				Thread.sleep(2000);
//				item.click();
//				//sometiems we may need a JS executor 
//				//js.executeScript("arguments[0].click();", item); 
//			}
	//	}


		// js.executeScript("alert('testing is fun')");
	}
}