package POMPagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage 
{
	WebDriver driver;
	
	//Locating web elements using page factory 
	@FindBy(xpath ="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id="upass")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	

	//constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);	
	}
	
	//methods
	public void setvalues()
	{
		username.sendKeys("abcd@gmal");
		password.sendKeys("12345");
	}
	
	public void loginmthd()
	{
		loginbtn.click();
	}
	
	public String titlemthd()
	{
		String title = driver.getTitle();
		return title;
	}
	
	

}
