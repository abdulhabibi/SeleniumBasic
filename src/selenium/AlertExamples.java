package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://tekschoo.us");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('testing is fun')");

		Thread.sleep(2000);
		// we have three type of alert
		// alert()
		// confirm()
		// prompt()
		
		// alert()
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(2000);
		// confirm()
		js.executeScript("confirm('trying to work wiht alert;)");
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		Thread.sleep(2000);
		js.executeScript("prompt('trying to work wiht alert;)");
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("test");

	}

}
