package checkboxes_radiobuttons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. Selecting the checkbox
		
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2. capturing all checkboxes
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkboxes :"+checkboxes.size());
		
//		//3. selecting all checkboxes using enhanced for loop
//		
//		for(WebElement checkbox:checkboxes) {
//			checkbox.click();
//		}

		//4. selecting all checkboxes using normal for loop
		// we have to use checkboxes.size() and not checkboxes.length()
		// to access the elements from the list we have to use checkboxes.get(i) and not checkboxes(i)
		
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//5. select last 3 checkboxes
		
//		for(int i=4;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//6. unselect checkboxes if they are selected
		// This can be done by checkboxes.get(i).click() but it is not the best method. We have to check the condition as well
		
//		for(int i=0;i<checkboxes.size();i++) {
//			if(checkboxes.get(i).isSelected()) { //checking the condition if checkboxes are selected. If true, click the checkboxes
//				checkboxes.get(i).click();
//			}
//		}
		
		//7. unselect checkboxes if selected and select if unselected. I have used enhanced for loop
		
//		for(WebElement checkbox:checkboxes) {
//			if(checkbox.isSelected()) {
//				checkbox.click();
//			}else
//			{
//				checkbox.click();
//			}
//		}
		
		//Radio buttons
		
		WebElement male_radio=driver.findElement(By.xpath("//input[@value='male']"));
		WebElement female_radio=driver.findElement(By.xpath("//input[@value='female']"));
		male_radio.click();

		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
