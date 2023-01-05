package Clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04_C02_ParalelTestDataProvider {

    @Test(dataProvider = "getData")
    public void test1(String  name,String surname) {
        System.out.println(name+" "+surname+" "+Thread.currentThread().getId());

    }
    @DataProvider(parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                {"esma","aslan"},
                {"esra","aslana"},
                {"ay","günes"},

        };
    }
}



