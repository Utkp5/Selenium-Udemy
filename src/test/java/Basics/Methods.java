package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	/* These all are methods
	1) get methods
	2) conditional methods
	3) Browser methods
	4) Navigational methods
	5) wait methods

	get methods  - we can use these methods through webdriver instance
	----------
	get(url)
	getTitle()
	getCurrentURL()
	getPageSource()    - it will return html code
	getWindowHandle()  - is used to get id of window and everytime it is unique 
	getwindowHandles() - it will return multiple id when windows are also open multiple

	conditional commands - access these commands through WebElement Returns true/false( boolean values)
	----------------------
	isDisplayed()
	isEnabled()
	isSelected()

	browser methods
	---------------
	close() - close single browser window
	quit()  - close all browser window  */

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		/*  get methods
        System.out.println("title of the page: "+ driver.getTitle());
		System.out.println("Current URL: "+ driver.getCurrentUrl());
				
		System.out.println("Page source......................");
		String ps=driver.getPageSource();
		System.out.println(ps);
		System.out.println(ps.contains("html"));
		
		//System.out.println(driver.getWindowHandle());  //CDwindow-3127F2DCB717E0F5993100E70756C523

		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='youtube']/a")).click(); // opens new browser window
		
		Set<String> windowids = driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			System.out.println(winid);  
		}
		*/
		
		
		/*      conditional methods  */
		
		//  isDisplayed() 
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("display status of logo : "+logo.isDisplayed());
				
		// isEnabled()		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Enable  status : "+searchbox.isEnabled());
		
		//isSelected()
		WebElement poll_1   =  driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		WebElement poll_2 =  driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
		
		System.out.println(poll_1.isSelected());
		poll_2.click();
		System.out.println(poll_2.isSelected());
		
		
		
		
	}
	
}
