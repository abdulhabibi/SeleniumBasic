package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropAndDownExamples {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		driver.get("https://jqueryui.com/droppable/");
//		
//		Actions a = new Actions(driver);
//		//WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		WebElement item1 = driver.findElement(By.xpath("//div[@id ='draggable']"));
//		WebElement item2 = driver.findElement(By.xpath("//div[@id ='droppable']"));
//		
//		//a.dragAndDrop(item1, item2).build().perform();
//		//wait.until(ExpectedCondition.elementToBeClickable(item1));
//		//wait.until(ExpectedCondition.visibilityOf(item2));
//		a.dragAndDrop(item1, item2).build().perform();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions a = new Actions(driver);
		
		WebElement item1 = driver.findElement(By.xpath("//div[@id ='draggable']"));
		WebElement item2 = driver.findElement(By.xpath("//div[@id ='droppable']"));
		
		a.dragAndDrop(item1, item2).build().perform();
		
	}

}
