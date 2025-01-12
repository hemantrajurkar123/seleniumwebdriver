package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// getCurrentUrl() gets the current url of the 
		System.out.println(driver.getCurrentUrl());
		
		// getTitle() gets the title of the current web page
		System.out.println(driver.getTitle());
		
		//getWindowHandle() gets the id of the window handle in the string format. Window handles are dynamic
	
//		String handle = driver.getWindowHandle();
//		System.out.println(handle);
		
		//getWindowHandles() returns multiple window handles. Return types is Set collection of strings which does not allow duplicate values
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); // to open another window to get multiple window handles
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}

//get methods - we can access these methods through webdriver instance
//----------
//get(url) - opens the url on the browser
//getTitle() - returns title of the page
//getCurrentUrl() - retuns URL of the page
//getPageSource()- returns source code of the page
//getWindowHandle() - returns ID of the single Browser window
//getWindowHandles() - retuns ID's of the multiple browser windows
