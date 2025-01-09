package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		// 1. tag id
//		driver.findElement(By.cssSelector("input#small-searchterms"));
		//tag name is optional
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		// 1. tag classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("phone");
		//tag name is optional
//    	driver.findElement(By.cssSelector(".search-box-text")).sendKeys("phone");
		
		//3. tag attribute
		//driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("tablets"); // as double quotes are not allowed insided another double quotes in java, we have to use escape \ just before the inner quotes
		//tag name is optional
//		driver.findElement(By.cssSelector("[name='q']")).sendKeys("tablets"); // as double quotes are not allowed insided another double quotes in java, we have to use escape \ just before the inner quotes

		//4. input class attribute
//		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("mobile");
		//tag name is optional
//		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("mobile");

//		driver.quit();
	}

}


// There are 4 types to use CSS selector
//1. tag id ---> tag#id
//2. tag className---> tag.classname
//3. tag attribute --> tag[attribute="value"]
//4. tag class attribute --->tag.classname[attribute="value"]