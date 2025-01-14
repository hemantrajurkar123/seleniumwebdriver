package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// declaration of implicit wait object

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// use of explicit wait
		// return type of until method is WebElement
		WebElement textusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		textusername.sendKeys("Admin");

		WebElement textpasswrd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		textpasswrd.sendKeys("admin123");
		
		WebElement loginbutton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		loginbutton.click();
		}
	

}

// Explicit wait is different from implicit wait. The implicit wait works on the time considerations. Explicit wait works on conditions.
// For explicit wait we have to first declare the explicit wait by creating the object of the class WebDriverWait
// On that driver we have to use the condition with the until() method
// Explicit wait works on individual elements. Means we have to write this wait for each element wherever necessary
