package ExampleAutomation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class _1RetailWebsiteAddItemsToCart {
	public static void main(String[] args) {
		
		// setting the property and defining where web driver is
		System.setProperty("webDriver.chrome.driver", "c:\\chromedriver.exe");
		// creating an object of the Chromedrvier
		WebDriver driver = new ChromeDriver();
		//setting the implicit timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//maximizing the window
		driver.manage().window().maximize();
	
		// going to the link
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		
		
		// creating objects of our web elements
		
		//Canon EOS 5D
		WebElement Mac = driver.findElement(By.linkText("Mac (1)"));
		Mac.click();
		
	//	creating an object of select to interact with the drop down on the page
		Select availableOptions = new Select(driver.findElement(By.id("input-option226")));
		availableOptions.selectByIndex(1);
		
		// create element of the quantity text box
		WebElement quantityOnProdPage = driver.findElement(By.id("input-quantity"));
		quantityOnProdPage.clear(); // clear the existing value
		quantityOnProdPage.sendKeys("5"); // send value 5 to the text box
		
		
		//create element of the add to cart button and clicking on it
		WebElement addToCartonProductPageBtn = driver.findElement(By.id("button-cart"));
		addToCartonProductPageBtn.click();
		
		
		//checking to see if we can click on the cart button and trying to remove added items
		WebElement cartBtn = driver.findElement(By.id("cart-total"));
		cartBtn.click();
		WebElement crossBtnOnTheCart = driver.findElement(By.xpath("//button[@title='Remove']")); // creating element of the cross on the cart
		crossBtnOnTheCart.click(); // clicking on the cross element on the cart
		
		
	}
	
}