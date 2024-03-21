package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_SS_Webelement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// capture screenshot of specific area from webpage 
		
		WebElement featuredproducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src = featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\Selenium-Udemy\\Screenshots\\featureproducts.png");
		FileHandler.copy(src, trg);
		
				
	}
}
