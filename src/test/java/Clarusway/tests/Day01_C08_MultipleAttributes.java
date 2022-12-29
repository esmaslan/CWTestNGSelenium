package Clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C08_MultipleAttributes {
    //bir test methodu birden fazla attribute kullanılarak configure edilebilir
    @Test(
            description = "This is a test case",
            priority = 18,
            groups = {"regression"},
            enabled = false
    )
    public void test() {

    }
}
