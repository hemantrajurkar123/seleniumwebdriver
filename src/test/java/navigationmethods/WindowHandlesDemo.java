package navigationmethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIds=driver.getWindowHandles(); //return type of getWindowHandles is Set<String>
		System.out.println(windowIds);
		List<String> windowhandlesList= new ArrayList(windowIds); // to get individual window ids we need to convert it to arraylist
		String parentId=windowhandlesList.get(0);
		String childId=windowhandlesList.get(1);
		driver.switchTo().window(childId);
		System.out.println("Child Id title :"+driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println("Parent Id title :"+driver.getTitle());

	}

}
