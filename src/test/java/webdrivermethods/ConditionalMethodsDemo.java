package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayd()
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);

		// isEnabled
		boolean status1 = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status1);

		// isSelected
		System.out.println("Before Selection...");
		WebElement male_radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_radio = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male_radio.isSelected()); // false
		System.out.println(female_radio.isSelected()); // false

		male_radio.click(); // select the male radio button
		System.out.println("After Selection ...");
		System.out.println(male_radio.isSelected());// true
		System.out.println(female_radio.isSelected()); // false
		
		boolean status3=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Newsletter Status :"+status);

	}

}

//conditional methods - access these commands thorugh WebElement
//-----------------------
//returns boolean value( true/false)
//
//isDisplayed() - we can check display status of the element. Any element ex. logos and other elements
//isEnabled() - we can check enable/disable status of the element/operational element . ex. input boxes
//isSelected() - we can use to check the element is selected or not. ex checkboxes and radio buttons
