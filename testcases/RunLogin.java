package testcases;

import org.testng.annotations.Test;

import pomLearning2.LoginPage;


public class RunLogin {

	
	@Test
	public void runLogin()
	{
	LoginPage lp = new LoginPage();
	lp.username().password().clickLoginButton().clickcrmsfa();
	
	}
}
