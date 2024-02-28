package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // amazon
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // flipkart
		Thread.sleep(2000);
		
		driver.navigate().refresh();  // refresh the page
		
	}
	
}
