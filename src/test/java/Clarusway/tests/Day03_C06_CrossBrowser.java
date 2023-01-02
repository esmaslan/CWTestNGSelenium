package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {
    //browser bilgisi testing.xml dosyasından alınacağından dolayı kod aşamasında herhangi bir değişiklik görüntülenmeyecektir

    @Test
    public void crossBrowserTest() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");

    }
}
