package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/index.php?route=product/product&product_id=42");

		Actions action = new Actions(driver);

//		WebElement readMoreBtn = driver.findElement(By.xpath(""));
//		Thread.sleep(2000);
//		action.moveElement(readMoreBtn).perform();
		driver.findElement(By.xpath("//textarea[@id = 'input-option209']")).sendKeys("I love to learn in Tek-School");
		
//		WebElement submitBtn = driver.findElement(By.className("submit-btn"));
//		WebElement image = driver.findElement(By.xpath("insert the path"));
		
		//action.moveToElement(messageTextBx).sendKeys(messageTextBx, "I love to learn in Tek-School").perform();
//		Thread.sleep(2000);
//		action.sendKeys(messageTextBx, "\nthis is me second line").perform();
		
		//control z "Undo"
		action.keyDown(Keys.CONTROL).sendKeys("z").build().perform();
		//control a "Select all the text"
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		// control c "copy"
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		//control v "paste"
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		

//		Thread.sleep(2000);
//		action.clickAndHold(submitBtn).perform();
//		
//		Thread.sleep(2000);
//		action.contextClick(image).perform();
//		
//		action.sendKeys(Keys.ENTER).build().perform();
		

	}

}