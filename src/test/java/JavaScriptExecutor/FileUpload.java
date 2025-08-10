package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String args[]){
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		String file1 = "C:\\Users\\Utkarsh.pandit\\Documents\\SQL.txt";
		
		WebElement upload =  driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		upload.sendKeys(file1);
		
		String fileName = driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText();
		
		if(fileName.equals("SQL.txt"))
		{
			System.out.println("Correct file uploaded");
		}else {
			System.out.println("Incorrect file uploaded");
		}
		
	}
	
}
