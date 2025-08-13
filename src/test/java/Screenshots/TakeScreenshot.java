package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		//refresh to see the ss in folder
		
		// Way 1  Capture full page screenshot - selenium 3 & 4
		 TakesScreenshot ts = (TakesScreenshot)driver; 
		 File from = ts.getScreenshotAs(OutputType.FILE); 
		 File to = new File("D:\\Selenium-Udemy\\Screenshots\\fullpage.png");
		 FileHandler.copy(from, to);	
		 
		 
		 
		// Way 2 Capture full page screenshot
//		 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		 File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
//		 sourceFile.renameTo(targetFile);
		 
		 
		 
		// Capture the screenshot of specific section
		 
		 WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		 
		 File sourceFile = section.getScreenshotAs(OutputType.FILE);
		 File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\featued.png");
		 sourceFile.renameTo(targetFile);
	
		 
		 driver.close();
	}

}
