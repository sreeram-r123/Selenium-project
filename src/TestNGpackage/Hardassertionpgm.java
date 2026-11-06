package TestNGpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hardassertionpgm 
{
	ChromeDriver driver;
	
	@BeforeClass
	public void browersetup()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	public void titleverification()
	{
		String actualtitle= driver.getTitle();
		//System.out.println(actualtitle);
		
		String expectedtitle = "Rediffmail Free Unlimited Storage";          
		Assert.assertEquals(expectedtitle, actualtitle);		
		System.out.println("Title verification Success");//this only execut only after assertion
	}
	
	@Test(priority =2)
	public void urlverification()
	{
		String actualurl =driver.getCurrentUrl();
		//System.out.println(actualurl);
		
		String epectedurl ="https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(epectedurl, actualurl);
		System.out.println("Url verification completed");
		
	}


}
