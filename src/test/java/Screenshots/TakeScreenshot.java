package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		
		// Capture full page screenshot - selenium 3 & 4
		 TakesScreenshot ts = (TakesScreenshot)driver; 
		 File from = ts.getScreenshotAs(OutputType.FILE); 
		 File to = new File("D:\\Selenium-Udemy\\Screenshots\\fullpage.png");
		 FileHandler.copy(from, to);	
		 
		 //refresh to see the ss in folder
	}

}
