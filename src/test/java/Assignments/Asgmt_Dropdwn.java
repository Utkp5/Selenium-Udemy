package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asgmt_Dropdwn
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement country = driver.findElement(By.id("country-list"));
		country.click();
		
		Select dropdwnC = new Select(country);
		
		dropdwnC.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.id("state-list"));
		state.click();
		Thread.sleep(2000);
		
		Select dropdwnS = new Select(state);
		
		dropdwnS.selectByValue("23");
		
		
		
	}
}