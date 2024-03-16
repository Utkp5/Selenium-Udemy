package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		//switch to iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/datepicker/default.html']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		//Appraoch 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2022"); // mm/dd/yyyy
		
		
		//Approach 2 is suitable
		String year="2026";
		String month="February";
		String date="17";
		
		//select month & year
			while(true)
			{
				String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String yr  = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(mon.equals(month) && yr.equals(year))
				{
					break;
				}
					
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // Future date
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   //Past date
					
							
			}
				
			
 		//select date	
			List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
			for(WebElement dt:allDates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
		
	}
}
