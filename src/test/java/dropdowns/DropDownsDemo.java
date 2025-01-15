package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 3 steps to select the option from the dropdown
		//1. Find the select tag 
		WebElement countryDropdown= driver.findElement(By.xpath("//select[@id='country']"));
		//2. create an object of type Select for the select tag
		Select countryDropDownItems= new Select(countryDropdown);
//		//3. use the methods from the Select object to select dropdown items
//		countryDropDownItems.selectByVisibleText("Japan");
//		countryDropDownItems.selectByValue("canada");
//		countryDropDownItems.selectByIndex(3);
		
		// capture the options from the dropdown using getOptions()
		List<WebElement> countries=countryDropDownItems.getOptions();
		System.out.println(countries.size());
		
		//printing options
		
		for(WebElement country:countries) {
			System.out.println(country.getText());
		}
		
		driver.quit();
		}

}
