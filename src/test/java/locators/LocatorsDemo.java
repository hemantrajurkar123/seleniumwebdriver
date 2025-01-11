package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://demo.opencart.com
// Locators:

//id -done
//name - dome
//link text -done
//partial link text

//TagName -done -used to select a group of elements
//className -done -used to select a group of elements


//
//CSS Selector
//Xpath

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		System.out.println(driver.findElement(By.id("logo")).isDisplayed());
//		WebElement searchbox=driver.findElement(By.name("search"));
//		searchbox.sendKeys("cameras");
//      driver.findElement(By.className("btn-light")).click();
//		driver.findElement(By.linkText("Desktops")).click();
//		driver.findElement(By.partialLinkText("Notebooks")).click();
		// using className to find multiple elements of the same class
		// The return type of findElements method is the list of web elements
		// Mostly it is used for validation, ex. number of links present on the page
		List<WebElement> header_elements = driver.findElements(By.className("list-inline-item"));
		System.out.println("Number of header elements :" + header_elements.size());

		// tagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on the page :" + links.size());

		driver.quit();

	}

}

// tagName and className- used when we have to perform an action on group of elements
// Always prefer linkText over partialLinkText
// If there are multiple elements with the same attributes, ex. name,linkText, partialLinkText, we have to use xpath 

/*findElement(loc) Vs findElements(loc)
----------------------------

Scenario1: Locator is smatching with single web element

findElement(loc) ----> single web element ---> WebElement
findElements(loc) ---> single web element ----> List<WebElement>

Sceanrio2 : Locator is matching with multiple web elements

findElement(loc) ---> single web element --> WebElement
findElements(loc) ---> multiple web elements ---> List<WebElement>

Scenario3: Locator is not matching with any element.

findElement(loc) ----> NosuchElementException
findElements(loc)----->will not throw any exception. Returns 0
*/