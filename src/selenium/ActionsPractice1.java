package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/index.php?route=product/product&product_id=42");

		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//textarea[@id = 'input-option209']")).sendKeys("I love to learn in Tek-School\n");
		
		
		
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
//		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
//		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("z").build().perform();
	
	
	}

}
