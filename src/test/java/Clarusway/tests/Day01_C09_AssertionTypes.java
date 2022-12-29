package Clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {
    @Test
    public void hardAssertion() {//hata olduğu anda testi durdurur->hardAssertion
        System.out.println("Assertion öncesi çalışıyor");
        Assert.assertEquals(1,2);//fail
        System.out.println("Assertion sonrası çalışıyor");
    }
    @Test
    public void softAssertion() {//assertAll methodunu çağırana kadar
        System.out.println("softAssertion öncesi çalışıyor");
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(1,2);//fail
        softAssert.assertTrue(true);//pass


        System.out.println("softAssertion sonrası çalışıyor");

        softAssert.assertAll();//method sununda muhakkak çağırılmalı


    }
}
