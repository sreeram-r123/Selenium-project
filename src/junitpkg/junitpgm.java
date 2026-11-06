package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitpgm {
	ChromeDriver driver= new ChromeDriver();
	@BeforeEach
	public void browsersetup()
	{
		System.out.println("Before Each method");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void titleverification()
	{
		 System.out.println("Test method 1");
		String actualtitle =driver.getTitle();
		String expectedtitle="Google";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Same title");
		}
		else
		{
			System.out.println("Wrong title");
		}
	}
	
	@Test 
	public void method2()
	{
		System.out.println("Method2");
	}
	
	@AfterEach
	public void closingmethod()
	{
		 System.out.println("After Each method");
		//driver.close();// to close the browser tab
		 driver.quit();
	}

}
