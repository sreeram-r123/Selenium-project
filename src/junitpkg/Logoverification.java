package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {
ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();

    }
	
	@Test
    public void logo() {

        WebElement logo1 = driver.findElement(By.xpath("//img[@title='Rediffmail']"));
        boolean result = logo1.isDisplayed();

        if (result) {
            System.out.println("Logo is displayed");
        } else {
            System.out.println("Logo is not displayed");
        }

        // Female radio button
        WebElement gender = driver.findElement(By.xpath("//input[@value='f']"));
        boolean btnenable = gender.isEnabled();
        System.out.println("Female button is enabled: " + btnenable);

        // Checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        boolean checkboxselec = checkbox.isSelected();

        if (checkboxselec) {
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is not selected");
            checkbox.click();
        }
    }
	
}

