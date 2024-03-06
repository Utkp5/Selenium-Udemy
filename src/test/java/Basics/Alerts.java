package Basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //impilicit wait condi
		
		//Simple alert
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Alert alertwindow=driver.switchTo().alert();
		//Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(alertwindow.getText());
		//alertwindow.accept();   // this will close alert window using ok button
		//alertwindow.dismiss();  // close alert window by using cancel button
		
		//Prompt alert  
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		alertwindow.sendKeys("Hello Utkarsh!");
		alertwindow.accept();
		Thread.sleep(2000);
		
		//validation
		String act_text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_text="You entered: Hello Utkarsh!";
						
		System.out.println(act_text);
		System.out.println(exp_text);
						
		if(act_text.equals(exp_text))
		{
		     System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
	}
}
