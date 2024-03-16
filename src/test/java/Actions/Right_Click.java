package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//if u just simple click on a btn it won't work, it work by right click
		WebElement rightclick = driver.findElement(By.xpath("//p//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click(); // click on copy option
		driver.switchTo().alert().accept();
	}
	
}
