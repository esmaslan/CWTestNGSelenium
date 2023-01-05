package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day04_C02_ParalelTestAttribute  {

    @Test(
            threadPoolSize = 4,
            invocationCount = 5
    )
    public void test1() {
        System.out.println("Cuurent thread Id = "+Thread.currentThread().getId());
    }
}



