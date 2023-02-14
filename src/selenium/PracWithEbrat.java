package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracWithEbrat {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		
		

		WebDriver driver = new ChromeDriver();

		// setting the implicit timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// setting the pageLoad timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		//going to Amazon website
		driver.get("https://amazon.com");
		Thread.sleep(2000);

		//Maximizing window
		driver.manage().window().maximize();

		//going into search options to narrow down the search 
		Select searchOptions = new Select(driver.findElement(By.xpath("//select[@id = 'searchDropdownBox']")));
		Thread.sleep(2000);

		//choosing 'handmade' option from search category
		searchOptions.selectByValue("search-alias=handmade");
//	

		//printing all of the available search options by storing all the options in a list and then printing them all
		List<WebElement> allDropDown = driver.findElements(By.xpath("//select[@id = 'searchDropdownBox']//option"));
		
		for (int i = 0; i < allDropDown.size(); i++) {
			System.out.println(i + 1 + " " + allDropDown.get(i).getText());
		}

		//locating searching box and searching for clothes
		WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		searchBox.sendKeys("clothes");
		

		//storing the search drop-down items in a list and then printing them through a for loop
		List<WebElement> searchDropDown = driver.findElements(
				By.xpath("//div[@class='autocomplete-results-container']//div [@class = 's-suggestion-container']"));
		Thread.sleep(2000);
		for (int i = 0; i < searchDropDown.size(); i++) {
			System.out.println(i + 1 + " " + searchDropDown.get(i).getText());
		}
		
		driver.close();
	}

}
