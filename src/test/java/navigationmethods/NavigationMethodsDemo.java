package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.growthmints.com"); // same as driver.get
		driver.navigate().to("https://www.nopcommerce.com/"); // same as driver.get
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("Refreshing page...");
		driver.navigate().refresh();

	}

}

//Navigational commands
//----
//navigate().to(url)
//navigate().back()
//navigate().forward()
//navigate().refresh()
