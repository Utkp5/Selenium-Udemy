package Actions_1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		driver.findElement(By.id("inputText1")).sendKeys("Welcome Utkarsh how are You!");

		Actions act = new Actions(driver);

		// ctrl + a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);

		// ctrl + c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		// tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// act.sendKeys(Keys.TAB).perform(); // only if want to press single key then prefer this

		// ctrl + v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}
}
