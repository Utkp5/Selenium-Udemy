package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interect_With_element {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver(); if we are using this 
	
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;            then we don't have to type cast
		
		
		//First name - inputbox
		WebElement inputbox = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		
		//Radio button
		WebElement male_Rd=driver.findElement(By.id("male"));
		//male_Rd.click();                //ClickInterceptedException error
		js.executeScript("arguments[0].click();",male_Rd);
		
		
		//Checkbox
		WebElement chkbox=driver.findElement(By.id("saturday"));
		js.executeScript("arguments[0].click();",chkbox);
		
		
	}
	
}
