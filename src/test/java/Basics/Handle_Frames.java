package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
				
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pandit"); // frame1
		
		driver.switchTo().defaultContent(); // switch back to page
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click(); 
		
		
	}
}
