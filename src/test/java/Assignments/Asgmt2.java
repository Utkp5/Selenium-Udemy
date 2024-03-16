package Assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asgmt2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://blazedemo.com");
		
		
		//Handle drop down
		WebElement drpdwn1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement drpdwn2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s = new Select(drpdwn1);
		Select s1 = new Select(drpdwn2);
		
		s.selectByVisibleText("Boston");
		s1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//handle table to get lowest price
		 int rows = driver.findElements(By.xpath("//table//tbody//tr")).size();
		 System.out.println("No. of rows in a table : " +rows);
		 
		 //capture prices then store in array
		 String pricearray[] = new String[rows];
		 for(int r=1;r<=rows;r++)
			{
				String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
				pricearray[r-1]=price; //adding price into array
			}
		 
		 //Sort prices then find lower price value		 
		  for(String arrayvalue:pricearray)
		  {
			  System.out.println(arrayvalue);
		  }
		 
		  Arrays.sort(pricearray);
		  String lowestPrice = pricearray[0];
		  System.out.println("Lower price:"+lowestPrice);
		  
		  
		  //Find record in table having lower price
		  for(int r=1;r<=rows;r++)
		  {
			  String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			  if(price.equals(lowestPrice))
				{
					driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
					break;
				}			  
		  }
		  
		  //handle text boxes to fill the values in it
		  
		  driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("Pandit");
		  driver.findElement(By.xpath("//input[@name='address']")).sendKeys("xyz");
		  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Burari");
		  driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Delhi");
		  driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("84");
		  WebElement dropdwn = driver.findElement(By.id("cardType"));		  
		  Select s3 = new Select(dropdwn);
		  s3.selectByValue("amex");
		  driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("54852255789622");
		  driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("10");
		  driver.findElement(By.xpath("//input[@name='creditCardYear']")).sendKeys("2050");
		  driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("Pandit");
	
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 
		 //validate the success page
		  String expectedTxt = "Thank you for your purchase today!";
		  String actualtxt = driver.findElement(By.tagName("h1")).getText();
		  
		  if(expectedTxt.equalsIgnoreCase(actualtxt))
		  {
			  System.out.println("Script sccessfully run!");
		  }
		  else {
			  System.out.println("Script Unsccessful!");			  
		  }
		 
		 
		 
		 
		 
		 
	}
}
