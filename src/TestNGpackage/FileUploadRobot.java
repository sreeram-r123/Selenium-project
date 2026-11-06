package TestNGpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadRobot 
{
ChromeDriver driver;
	
	@BeforeClass
	public void browser_setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void Fileuploadmthd()
	{
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		upload.click();
		upload.sendKeys("\"C:\\Users\\ASUS\\Downloads\\Sreeram R resume_20260607_172658_0000.pdf\"");
	}
	
	public void fileUpload(String p) throws Exception
	{
		StringSelection strobj = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strobj, null);

		Robot rob = new Robot();
		rob.delay(3000);

		rob.keyPress(KeyEvent.VK_CONTROL); // VK- virtual key
		rob.keyPress(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		rob.delay(2000);
		System.out.println("File uploaded succesfully");
		
	}

}
