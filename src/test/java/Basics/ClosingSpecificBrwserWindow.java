package Basics;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClosingSpecificBrwserWindow {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();

		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			//String url=driver.switchTo().window(winid).getCurrentUrl();
			
			
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other title"))
			{
				driver.close();
			
			}
		}
		
		// Appoach1
		/*
		 * List<String> windowList=new ArrayList(windowIDs); String
		 * parentID=windowList.get(0); String childID=windowList.get(1);
		 * 
		 * //switch to child window driver.switchTo().window(childID);
		 * System.out.println(driver.getTitle());
		 * 
		 * //switch to parent window driver.switchTo().window(parentID);
		 * System.out.println(driver.getTitle());
		 */

		// Approach2

//		for (String winId : windowIDs) {
//			String title = driver.switchTo().window(winId).getTitle();
//
//			if (title.equals("OrangeHRM")) {
//				System.out.println(driver.getCurrentUrl());
//				// some validation on the parent window
//			}
//
//		}		
		
		
		
	}
	
}
