package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Hover {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		WebElement txt1 = driver.findElement(By.id("menu-item-1068"));
		WebElement txt2 = driver.findElement(By.xpath("//a[text()='Apache POI – Java']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(txt1).moveToElement(txt2).click().build().perform();
		//act.moveToElement(txt1).moveToElement(txt2).click().perform();
		
		// both build().perform() && .perform() are having different meaning means having slight difference 
		//to check out difference see action vs actions class
	}
}
