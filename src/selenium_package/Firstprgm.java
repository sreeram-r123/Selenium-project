package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprgm {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		// for opening edge EdgeDriver 
		//EdgeDriver driver= new EdgeDriver();
		//FirefoxDriver driver= new FirefoxDriver();// for opening Firefox 
		driver.get("https://www.google.com/");
		
		String actualtitle = driver.getTitle();//for retrive the title of the web application
		System.out.println("The title of the web application is : "+actualtitle);
		
		String expectedtitle = "Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("The title is a match");			
		}
		else
		{
			System.out.println("The title is a not match");
		}

	}

}
