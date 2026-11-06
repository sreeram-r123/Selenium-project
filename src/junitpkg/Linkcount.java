package junitpkg;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount 
{
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void linkcount()
	{
		List<WebElement> link =driver.findElements(By.tagName("a"));//tag name "a"
		System.out.println("Link count =" +link.size());
		
		for(WebElement li: link)
		{
			System.out.println(li.getText()+"----"+li.getAttribute("href"));
			
		}
	}
	

}
