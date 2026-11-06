package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileupsendkeys 
{
ChromeDriver driver;
	
	@BeforeClass
	public void browser_setup()
	{
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileuplod(){
		{
			WebElement upload = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
			upload.sendKeys("\"C:\\Users\\ASUS\\OneDrive\\Pictures\\New folder\\Screenshots\\Screenshot 2026-10-24 093228.png\"");
		}
	}
}
		


