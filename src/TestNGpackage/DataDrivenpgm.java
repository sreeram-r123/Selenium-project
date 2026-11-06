package TestNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Excelutils;

public class DataDrivenpgm 
{
	 ChromeDriver driver;
	    WebDriverWait wait;

	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://keralaproperty.in/member/login/");

	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getData() throws Exception {

	        String path = "C:\\Users\\ASUS\\Downloads\\logindatas.xlsx";
	        String sheet = "login";

	        return Excelutils.getTestData(path, sheet);
	    }

	    @Test(dataProvider = "loginData")
	    public void loginTest(String uname, String pass) {

	        // Enter username
	        WebElement username = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//*[@id='ulogin']")
	            )
	        );
	        username.clear();
	        username.sendKeys(uname);

	        // Enter password
	        WebElement password = driver.findElement(
	            By.xpath("//*[@id='upass']")
	        );
	        password.clear();
	        password.sendKeys(pass);

	        // Click login
	        driver.findElement(
	            By.xpath("//*[@id='sub_logbtn']")
	        ).click();

	        // Check for either a successful login or an error message
	        try {
	            wait.until(ExpectedConditions.or(
	                ExpectedConditions.urlContains("myhome"),
	                ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath(
	                        "//*[contains(text(),'Invalid Login Credentials.')]"
	                    )
	                )
	            ));

	            if (driver.getCurrentUrl().contains("myhome")) {
	                System.out.println(
	                    "Login successful for: " + uname
	                );
	            } else {
	                System.out.println(
	                    "Invalid username or password for: " + uname
	                );
	            }

	        } catch (org.openqa.selenium.TimeoutException e) {
	            System.out.println(
	                "Login result could not be determined for: " + uname
	            );
	            System.out.println(
	                "Current URL: " + driver.getCurrentUrl()
	            );
	            System.out.println(
	                "Page title: " + driver.getTitle()
	            );

	            throw e;
	        }
	    }

	    @AfterMethod(alwaysRun = true)
	    public void browserClose() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
