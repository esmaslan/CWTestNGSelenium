package Clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C05_Timeout {
    //timeOut set edildiğinde test süresi bu süreyi geçmemelidir.geçmesi durumunda test exception fırlatır
    //tieout gerçekleştiği andan itibaren sonraki satırlar execute edilmez(çalıştırılmaz).
    //Exception sonrası kod bloklarımzı execute edilmez ,kod yarıda kesilir.

    @Test(
            timeOut = 1000
    )
    public void passedTest() {
        System.out.println("1 saniyeden önce çalıştı");
    }

    @Test(
            timeOut = 1000
    )
    public void timeOutTest() throws InterruptedException{
        // Sout ifademiz calisacaktir timeout exceptiondan once calistigindan dolayi
        System.out.println("1 saniyeden sonra çalıştı");
        Thread.sleep(1100);
    }
    @Test(
            timeOut = 1000
    )
    public void timeOutTest2() {
        //sout ifademzi çalışmayacaktır timeout exceptiondan dolayi
        System.out.println("1 saniyeden sonra çalıştı");
    }
}
