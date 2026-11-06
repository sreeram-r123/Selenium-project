package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_pgm 
{
	@BeforeClass
    public void BFClassmthd() {
        System.out.println("Before class mthd");
    }

    @Test(priority = 1 , groups ="Smoke" )
    public void Mthd_A() {
        System.out.println("Mthd_X------");
    }
    
    @Test(priority = 2 ,groups ="Sanity" )
    public void Mthd_B() {
        System.out.println("Mthd_A------");
    }
    
    @Test(priority = 3 ,groups ={"Regression","Smoke"})
    public void Mthd_D() {
        System.out.println("Mthd_C------");
    }
    
    @AfterClass
    public void AFClass_mthd()
    {
    	System.out.println("AfterClass_Mthd----");
    }
}
