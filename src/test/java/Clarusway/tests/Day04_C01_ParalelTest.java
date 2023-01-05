package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day04_C01_ParalelTest extends BaseCrossBrowserTest {

    @Test
    public void test1() {
        driver.get("https://www.google.com.tr/");
    }
    @Test
    public void test2() {
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void test3() {
        driver.get("https://www.trendyol.com/");
    }
}
