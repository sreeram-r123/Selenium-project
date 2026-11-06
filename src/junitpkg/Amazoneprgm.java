package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoneprgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_set()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
	}
	
	
	@Test
	public void home() throws Exception
	{
		Thread.sleep(2000);//java wait,used to wait for particular time period here it is 2 second (2000 millisecond)
		WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("Mobiles");
		search.sendKeys("Mobiles",Keys.ENTER);//to press the enter key(key.enter)
		
		
	}

}
