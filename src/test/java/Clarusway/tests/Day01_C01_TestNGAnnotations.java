package Clarusway.tests;

import org.testng.annotations.*;

public class Day01_C01_TestNGAnnotations {
    //@before/After Suite
//@before/After Test
//@before/After Class
//@before/After Method

    @Test
    public void test1() {
        System.out.println("Test1 çalışıyor");
    }

    @Test
    public void test2() {
        System.out.println("Test2 çalışıyor");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite çalışıyor");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite çalışıyor");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest çalışıyor");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test calisti");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class calisti");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class calisti");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method calisti");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method calisti");
    }
    //***********Run sırası***********
//BeforeSuite çalışıyor
//BeforeTest çalışıyor
//Before class calisti
//Before method calisti
//Test1 çalışıyor
//After method calisti
//Before method calisti
//Test2 çalışıyor
//After method calisti
//After class calisti
//After test calisti
//AfterSuite çalışıyor


}
