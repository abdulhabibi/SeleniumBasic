package selenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindowWithTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		Actions a = new Actions(driver);

		WebElement aboutBtn = driver.findElement(By.xpath("//a[@class='MV3Tnb'][contains(text(), 'About')]"));

		WebElement Store = driver.findElement(By.xpath("//a[@class = 'MV3Tnb'][contains(text(), 'Store')]"));

		// waiting for the laptops button to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(aboutBtn));
		// holding control key down, the clicking on the laptops button on the page to
		// open it in a new tab
		a.keyDown(Keys.CONTROL).click(aboutBtn).build().perform();

		// waiting for the Components button to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(Store));
		// holding control key down, the clicking on the Components button on the page
		// to
		// open it in a new tab

		a.keyDown(Keys.CONTROL).click(Store).build().perform();

		// getwindowhandle will return the key for the current window
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);

		// getWindowHandle will return the keys to all of the open tabs in that session
		// this method will return a set o fString
		Set<String> allWndowKeys = driver.getWindowHandles();

		// this map will store the title of the tabs as values and window keys and key <Window Key, Window Title>
		Map<String, String> windowTitleAndKeys = new HashMap<String, String>();

		for (String key : allWndowKeys) {
			Thread.sleep(3000);
			driver.switchTo().window(key);
			Thread.sleep(3000);
			windowTitleAndKeys.put(key, driver.getTitle());
		}
		System.out.println(windowTitleAndKeys + "\n");
	}

}
