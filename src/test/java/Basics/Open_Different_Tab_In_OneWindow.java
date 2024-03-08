package Basics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Different_Tab_In_OneWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Search
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		//get searched text
		 List<WebElement> search_txt = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		 System.out.println("Number of Links:"+ search_txt.size());
		 
		 //clicking on each links
		 for(WebElement txt:search_txt)
		 {
			 System.out.println(txt.getText());
			 txt.click();
		 }
		 
		 
		//After opening all the pages, capture windowid's
		 Set<String> windowsID = driver.getWindowHandles();
		 System.out.println(".........Switching to each browser window and getting the titles........"); 
		 for(String win :windowsID) 
		 {
			 WebDriver Capture_Title = driver.switchTo().window(win);
			 System.out.println(Capture_Title.getTitle());
		 }
		 
		 
		 //closing all tabs
		 driver.quit();
	}
	
}
