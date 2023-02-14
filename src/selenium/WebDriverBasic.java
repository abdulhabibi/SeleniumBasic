package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverBasic {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir" + "C:\\.chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/real-estate/");
		// driver.findElement(By.name ("login")).click();
		driver.findElement(By.id("priceMin")).sendKeys("1000");
		driver.findElement(By.id("priceMax")).sendKeys("2000");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

//		WebElement findBTN = driver.findElement(By.id("btnleft"));
//		clickOnBtn(findBTN, driver);

		System.out.println("End of the excution");
	}

//	public static void clickOnBtn(WebElement btn, WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(btn));
//		btn.click();
//	}
}
