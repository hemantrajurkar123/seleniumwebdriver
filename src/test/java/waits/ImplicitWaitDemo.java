package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait statement
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

}

// Implicit wait is used to solve the synchronization problem. If the selenium script and application is not in sync, it will throw an exception.
// To solve this problem we use implicit wait
// We have to write the implicit wait statement just after the creation of the WebDriver object
// The way it works is, the wait time we have provided, will be applicable to each and every statement in the selenium code
// If the elements in the application are immediately available, it will not wait for that element, but if the element is not available it will wait for MAXIMUM of time we have provided
// ex. if element becomes available in the 3 seconds and we have provided the time of 10 seconds, it will act on the element in 3 seconds
// The only disadvantage is, if the element is not availble within the timeframe we have provided, it will still throw an exception.
