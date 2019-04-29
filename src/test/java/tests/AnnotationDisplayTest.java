package tests;


import org.testng.Assert;
import org.testng.annotations.*;


public class AnnotationDisplayTest {


    @BeforeTest
    public void testCase1() {
    System.out.println("BeforeTest executing");

}
    @AfterTest
    public void testCase2() {
        System.out.println("AfterTest execution ");
    }

@AfterMethod
    public void testCase3(){
        System.out.println("AfterMethod execution");
    }

    @BeforeMethod
    public void testCase4(){
        System.out.println("BeforeMethod execution");
    }

    @AfterClass
    public void testCase5(){
        System.out.println("AfterClass Execution");
    }

    @BeforeClass
    public void testCase6(){
        System.out.println("BeforeClass Execution");
    }

    @AfterSuite
    public void testCase7(){
        System.out.println("AfterSuite Execution");
    }

    @BeforeSuite
    public void testCase8(){
        System.out.println("AfterSuite Execution");
    }

    @Test
    public void testCase9(){
        System.out.println("Test1 Execution");
    }

    @Test
    public void testCase10(){
        System.out.println("Test2 Execution");
    }


}




