package POMTestpkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMBasepkg.Baseclass;
import POMPagepkg.LoginPage;

public class LoginTest extends Baseclass //to restore the driver information
{
	LoginPage obj;
	
		
	@BeforeMethod
	public void objmthd()
	{
		obj=new LoginPage(driver);

	}
	
	
	@Test
	public void logintestmthd()
	{
		obj.setvalues();
		obj.loginmthd();
	}
	
		
	@Test
	public void titleverification()
	{
		
		System.out.println(obj.titlemthd());
	}
}


