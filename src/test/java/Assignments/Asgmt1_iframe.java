package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmt1_iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		//switch to iframe
		driver.switchTo().frame("mce_0_ifr");
		WebElement p_Tag = driver.findElement(By.tagName("p"));
		p_Tag.clear();
		p_Tag.sendKeys("Welcome Utkarsh How're You!");
		
	}
	
}
