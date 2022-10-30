package pomLearning2;

import org.openqa.selenium.By;

import PomLearning.BaseClass;
 
 

public class LoginPage extends BaseClass {

	public LoginPage username() {
		 
		 driver.findElement(By.id("user")).sendKeys("Demosalesmanager");
		 return this;
		 
	}
	
	public LoginPage password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		 return this;
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
		 
		

	}
	
}
