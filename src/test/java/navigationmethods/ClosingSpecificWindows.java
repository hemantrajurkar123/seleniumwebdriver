package navigationmethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowHandleIds = driver.getWindowHandles();
		for (String windowHandle : windowHandleIds) {
			String title = driver.switchTo().window(windowHandle).getTitle();
			System.out.println(title);
			if (title.equals("Human Resources Management Software | OrangeHRM"))
				driver.close();
		}

	}

}

//Logic
//1. Iterate through window handles using enhanced for loop
//2. get titles for each window using getTitle() method
//3. Store that title in the variable and if title eqauls the title of the window to be closed, close using driver.close()