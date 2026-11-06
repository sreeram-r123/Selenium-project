package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeTest
	public void Beforetestedmthd() 
	{
		System.out.println("Beforetest method --------");
	}
	
	@BeforeTest
	public void Beforeclassmthd() 
	{
		System.out.println("Beforeclass method --------");
	}
	
	@BeforeTest
	public void mthd() 
	{
		System.out.println("Before method --------");
	}
	
	
	@Test
	public void testmethdA()
	{
		System.out.println("Test method A --------");
	}
	
	@Test
	public void testmethdX()
	{
		System.out.println("Test method X --------");
	}
	
	
	@Test
	public void testmethdC()
	{
		System.out.println("Test method C --------");
	}
	
	
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("Ater method  --------");
	}
	
	@AfterClass
	public void afterclassmthd()
	{
		System.out.println("After Class method  --------");
	}
	
	@AfterTest
	public void AftertestMthd()
	{
		System.out.println("AfterTest method  --------");

	}
	
	

}
