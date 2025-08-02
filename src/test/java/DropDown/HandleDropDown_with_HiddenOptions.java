package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown_with_HiddenOptions {

	public static void main(String[] args) {

        //Handle DropDown with Hidden Options
		
//		 1. Click on the ‘blur’ option from the Elements inside Event listner.
//		 2. Once you click on the blur option, you will see the ‘Remove’ button.
//		 3. Click on the Remove button.
//		 4. Once again go to the same dropdown right click on it and inspect.
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//li//a//span[text()='Recruitment']")).click();
		
		//Dropwdown
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();// opens the dropdown
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		for(WebElement option:options)
		{
			//System.out.println(option.getText());
			if(option.getText().equals("IT Manager"))
			{
				option.click();
				break;
			}
		}
		
	}

}
