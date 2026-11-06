package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm 
{
	@BeforeClass
    public void BFClassmthd() {
        System.out.println("Before class mthd");
    }

    @Test(priority = 1 ,invocationCount = 3)
    public void Mthd_X() {
        System.out.println("Mthd_X------");
    }
    
    @Test(priority = 2 , enabled = false)
    public void Mthd_A() {
        System.out.println("Mthd_A------");
    }
    
    @Test(priority = 3 )
    public void Mthd_C() {
        System.out.println("Mthd_C------");
    }
    
    @AfterClass
    public void AFClass_mthd()
    {
    	System.out.println("AfterClass_Mthd----");
    }
    
}


