package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstapDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		// find the dropdown element and click on it to open the options
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		//select a single element from the dropdown
//		driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		
		//capture all elements and find out size
		
		List<WebElement> dropDownOptions=driver.findElements(By.xpath("//label[@class='checkbox']"));
		System.out.println("Number of dropdown options : "+dropDownOptions.size());
		
		//get the names of all options
		for(WebElement drpOption:dropDownOptions)
		{
			System.out.println(drpOption.getText());
			
		}
		
		Thread.sleep(10000);
		driver.quit();
		}

}
