package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		// xpath with single attribute
//		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("shirts");
		
		//xpath with multiple attributes
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("mobile");
		
		//xpath with 'and' 'or' operators
		// and operator
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("laptop");
		// if both the conditions do not match it will give NoSuchElementException
		
		//or operator
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("laptop");
		// even if one condition match it will be successfully executed
		
		//xpath with inner text
//		String mactext=driver.findElement(By.xpath("//a[text()='MacBook']")).getText(); // no need to use @, use text() method
//		System.out.println(mactext);
		
		// xpath with 'contains' and 'starts-with'
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("pen");
		
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("paper");
	}

}

/* XPath
----
XPath is an address of the element.

DOM - Document Object Model

2 types of xpath
-----------
1) Absolute xpath(full xpath)
	Ex: 	/html/body/header/div/div/div[2]/div/input

2) Relative xpath(partial xpath)
	Ex: //*[@name="search"]

Which xpath will be prefered?
Relative xpath.


Difference between Absolute & Relative xpaths?
------------------
1) Absolute xpath starts with  /     ---> represents root node
  Relative xpath starts with  //

2) Abosulate xpath do not use attributes
  Relative xpath works with attribute

3) Absolute xpath traverse through each node till it finds element
   Relative xpath directly jump and find the element by using attribute

Relative xpath
----------------
1) Automatically - Devtools, selectorshub
2) Manually(own xpath) 


//img[@title='Your Store']
/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]


syntax:
----
//tagname[@attribute='value']
//*[@attribute='value']

//img[@title='MacBook']


Xpath with single attribute
----
driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
	

xpath with multiple attributes
-------
//input[@name='search'][@placeholder='Search']

xpath with 'and'  'or' operators
-------------------------


//input[@name='search' and @placeholder='Search']
//input[@name='search' or @placeholder='Search']

xpath with inner text - text()
-----------
//a[text()='Desktops']
//a[text()='MacBook']


<a href="https://xyz.com"> Click Me </a>
	
linktext = yes
inner text = yes

<div>welcome</div>
linktext= no
innertext= yes


xpath with contains()
---------------------
//input[contains(@placeholder,'Sea')]


handling dynamic attributes
-------------

//*[@id='start' or @id='stop']
//*[contains(@id,'st')]
//*[starts-with(@id,'st')]


name=xyz001  xyz002   xyz 003 xyz004 xyz001 xyz 002

//*[contains(@name,'xyz')]
//*[contains(@name,'00')]
//*[starts-with(@name,'xyz')]


name= 1xyz 2xyz 3xyz 4xyz 1xyz
	//*[contains(@name,'xyz')]


name=101xyz  201xyz  301xyz  401xyz
	//*[contains(@name,' xyz')]
	//*[contains(@name,' 01')]

chained xpath
---------------
//div[@id='logo']/a/img



<div></div>

//div[contains(text(),'')]
//[contains(.,’ ‘)] 
*/
