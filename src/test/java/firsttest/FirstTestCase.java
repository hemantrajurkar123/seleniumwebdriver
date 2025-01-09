package firsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//1. Open the URL https://demo.opencart.com"
//2. Validate the title "Your Store"
//3. Close the browser
public class FirstTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		String actual_title=driver.getTitle();
		if(actual_title.equals("Your Store")) {
			System.out.println("Actual title :"+actual_title);
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.quit();
	} 

}
