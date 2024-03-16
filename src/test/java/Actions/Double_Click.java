package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//if u just click on a btn then it won't copy to next textfield u have to double click on a btn to print it
		// in a nxt field
		
		driver.switchTo().frame("iframeResult"); 
		
		WebElement TF1 = driver.findElement(By.id("field1"));
		WebElement TF2 = driver.findElement(By.id("field2"));
		
		TF1.clear();
		TF1.sendKeys("Welcome Utkarsh!");
		
		Actions act = new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		act.doubleClick(button).click().perform();
		
		//To get the value from TF2 we use
		
		//String copiedtext = TF2.getText();  // will not work
		  String copiedtext = TF2.getAttribute("value");  // this will work bcz to get a value from txt field we have to use getattribute() not gettext()
				
		  System.out.println("Copied text is:"+copiedtext);
		
	}
	
}
