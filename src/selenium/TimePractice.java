package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TimePractice {

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir" + "\\drivers\\chromedriver.exe"));
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/real-estate");
		
		Select ss = new Select(driver.findElement(By.id("city")));
		
		ss.selectByIndex(1);
		
	}

}


