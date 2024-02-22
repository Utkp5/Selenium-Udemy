package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmt1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='admin@yourstore.com']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='admin']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='admin@yourstore.com']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@value='admin']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//verify text
		String actual_text = driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();
		String expected_text = "Dashboard";
		
		if(actual_text.contains(expected_text))
		{
			System.out.println("Text matched!");
		}
		else {
			System.out.println("Text not matched!");			
		}

	} 
	
}
