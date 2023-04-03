package days.day29;
import days.day18.*;  // Kullanilmadigi icin sönuk göruluyor.
import days.day27.C1_PrimeNumbers;
import java.util.ArrayList;

public class MatematikTest {
    public static void main(String[] args) {
        Matematik islem=new Matematik();
        islem.toplama(23,37);
        islem.carpma(20,30);
        double carpma=islem.carpma(20,30);
        System.out.println("carpma = " + carpma);
        islem.karesi(3,4);
        ArrayList<String> list=new ArrayList();
        C1_PrimeNumbers numbers=new C1_PrimeNumbers();


    }
}
