package pomLearning2;

import org.openqa.selenium.By;

import PomLearning.BaseClass;

public class WelcomePage extends BaseClass{

	
	
	public HomePage clickcrmsfa() {
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 return new HomePage();
		 
	}
	
	
}
