package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responcecode2 
{
	ChromeDriver driver;
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/Login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkcount() throws Exception
	{
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Number of links = " +links.size());
		
		for(WebElement li:links)
		{
			String url = li.getAttribute("href");
			verify(url);
		}
		
	}

	private void verify(String url) throws Exception 
	{
		try {
			
		
		URI obj = new URI(url);
		URL value =obj.toURL();
	    HttpURLConnection con = (HttpURLConnection) value.openConnection();
	    int responcecode = con.getResponseCode();
		
	    
	    if(responcecode==200)
		{
			System.out.println("Valid link"+url);
		}
		else if(responcecode==404)
		{
			System.out.println("Broken link"+url);
		}
		else
		{
			System.out.println("Other Response code"+url);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}	
}
