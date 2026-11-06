package TestNGpackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Windowhandlingdemosite 
{
	ChromeDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.manage().window().maximize();
    }

    @Test
    
    public void windowhandle() throws Exception
    {
    	
    	String parentwindow = driver.getWindowHandle();

        System.out.println("title " + driver.getTitle());

        // Tabbed window
        WebElement tabbtn = driver.findElement(
            By.xpath("//*[@id=\"Tabbed\"]/a/button"));
        tabbtn.click();

        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        driver.switchTo().window(parentwindow);

        // Separate window
        WebElement windowbtn = driver.findElement(
            By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        windowbtn.click();

        driver.findElement(
            By.xpath("//*[@id=\"Seperate\"]/button")).click();

        System.out.println("title " + driver.getTitle());
        Thread.sleep(2000);

        driver.switchTo().window(parentwindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Multiple windows
        WebElement multiple = driver.findElement(
            By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
        multiple.click();

        driver.findElement(
            By.xpath("//*[@id='Multiple']/button")).click();

        System.out.println("title " + driver.getTitle());
        Thread.sleep(2000);
    }
    
    @AfterTest
    public void teardown()
    {
        driver.quit();

    }
}
