package Clarusway.tests;

import org.testng.annotations.*;

public class Day02_c03_ParametersExample {
    String driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName){

        if (browserName.equals("chrome")){
            driver="chrome";

        }else if (browserName.equals("firefox")){
            driver="firefox";
        }else if (browserName.equals("opera")){
            driver="opera";
        }

        System.out.println("Driver objesi oluşturuldu - ");


    }

    @AfterMethod
    public void tearDown() {
        driver="-";
        System.out.println("Driver kapandı "+driver);

    }

    @Test
    public void test() {
        System.out.println("Test execution başladı ");
        System.out.println("testte kullanılan driver = "+driver );
    }
}
