package selenium.basic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBxVsRadioBtnExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://tekschool.us/contact/");
		
		WebElement chkBx = driver.findElement(By.xpath("//input[@type = 'checkbox' and @name='acceptance-737']"));
		
		System.out.println(chkBx.isDisplayed());
		System.out.println(chkBx.isEnabled());
		System.out.println(chkBx.isSelected());
		
		
		if(!chkBx.isSelected()) {
			chkBx.click();
			System.out.println("Check box selected!");
		} else {
			System.out.println("its already selected");
		}
		
		if(!chkBx.isSelected()) {
			chkBx.click();
		} else {
			System.out.println("its already selected");
		}
		
	}
}