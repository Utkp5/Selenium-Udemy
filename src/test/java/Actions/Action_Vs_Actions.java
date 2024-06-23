package Actions;

import org.openqa.selenium.interactions.Actions;

public class Action_Vs_Actions {

	public static void main(String[] args) {
//		http://demo.guru99.com/test/drag_drop.html
		
        //WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Actions act=new Actions(driver);
		
		//act.contextClick(button).build().perform();
		
		
		// Action myaction=act.contextClick(button).build();   creating action and storing it in variable
		// myaction.perform();   completing action 
		
		/*
		 
			build() - create an action
			perform() - can complete the action
			
			if we use build().perform() then it will first create action and then again it will create an action
			and then it will complete an action, means it will work 3 time bcz
			
			inside perform() it has internally build() which also run by perform()
			
			so if u write only perform then it is also correct but the diff is that when u only use .perform()
			it will first create action and then complete the action
			
			so why there is diff between both of them bcz
			some cases are there where u just want to create action and store that action in a variable and use it
			one by one not at the same time --like creating and compeleting an action is build.perform in same line
			
			
			
		 
		 */
	}
}
