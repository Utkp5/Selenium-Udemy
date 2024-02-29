package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_SuggestsDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("street food");	
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='sbqs_c']//b"));
		System.out.println("Number of suggestions : "+list.size());
		
		for(WebElement web : list)
		{
			String text = web.getText();
			//System.out.println(text);
			if(text.equals("street food india"))
			{
				web.click();
				break;
			}
		}
		
	}
	
}
