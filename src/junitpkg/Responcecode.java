package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responcecode 
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
	public void login() throws Exception
	{
		String url = driver.getCurrentUrl();
		URI obj= new URI(url) ;//to verify the link is in the test format
		URL link =obj.toURL();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		int responcecode = con.getResponseCode();
		System.out.println("Responcecode is " +responcecode);
		
		
		if(responcecode==200)
		{
			System.out.println("Valid link");
		}
		else if(responcecode==404)
		{
			System.out.println("Broken link");
		}
		else
		{
			System.out.println("Other Response code");
		}
	}

}
