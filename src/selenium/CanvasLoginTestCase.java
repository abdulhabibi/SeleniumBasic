package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLoginTestCase {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// go to Canvas
		driver.get("https://canvas.instructure.com/login/canvas");

		// maximize the page
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// enter valid user name
		WebElement userName = driver.findElement(By.id("pseudonym_session_unique_id"));
		userName.sendKeys("malikafga2009@gmail.com");
		Thread.sleep(2000);

		// enter valid password
		WebElement password = driver.findElement(By.id("pseudonym_session_password"));
		password.sendKeys("Kandahar@786");
		Thread.sleep(2000);

		// click on the login btn
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text (),'Log')]"));
		loginBtn.click();
		Thread.sleep(2000);

		// you should see the dashboard
		WebElement dashboard = driver.findElement(By.xpath("//span[@class='hidden-phone']"));

		if (dashboard.isDisplayed()) {
			System.out.println(dashboard.getText());
			System.out.println("test passed");
		} else {
			System.out.println("test faield");
		}
		driver.close();
	}

}
