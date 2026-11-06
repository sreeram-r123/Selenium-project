package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeralapropetyLogin {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/Login/");
		driver.manage().window().maximize();//to maximize the window
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("Title of the web page :"+actualtitle);
	}
	
	@Test
	public void textverification()
	{
		String sourcecode =driver.getPageSource();//to retrive the source code information
		
		if(sourcecode.contains("User Login"))
		{
			System.out.println("text is present:");
		}
		else 
		{
			System.out.println("Text is not present:");
		}
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("ulogin"));//locating username with locator i
	    username.sendKeys("abcd");//only accept sendkeys
	}
	
}
