package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown_with_Selecttag {

	public static void main(String []args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drpdwn = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(drpdwn);
		
		s.selectByVisibleText("Google");
		
	}
	
}
