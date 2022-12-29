package Clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C03_DependsOn {
    //homepage tesitmiz login testimize bağlı olduğu için dependson attribute umuzu kullanabiilriz
    //bağımlı olunan test fail olursa bağımlı olanmethod ignore edilir.
    //bağımlı olan method alfabetik execution a bakılmaksızın bağımlı olunan methoddan sonra çalışır
    // Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir
    @Test
    public void loginTest() {
        System.out.println("Login testi yapılıyor");
    }
    @Test
    public void registrationTest() {
        System.out.println("registrationTest testi yapılıyor");

    }
    @Test(dependsOnMethods = {"loginTest","registrationTest"})//parantez içindeki sıralama önemli değil yine alfabetik çalışır
    public void homePageTest() {
        System.out.println("Home page testi yapılıyor");

    }

}
