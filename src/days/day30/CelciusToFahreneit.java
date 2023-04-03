package days.day30;

import java.util.Scanner;

public class CelciusToFahreneit {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" Lutfen celcius degerini giriniz");
        double cel =input.nextDouble(); // kullanicini konsola girdigi degeri double bir degere atadik
        // double fahreneit = fahreneit(cel); // metohdu cagiriyoruz ve bir degiskene atadik

        // methodu degiskene atamadan da sout icine atarak da okutabiliriz
        System.out.println("Girdinginiz degerin Fahreneit karsiligi = " + (fahreneit(cel)));

    }
    public static double fahreneit(double cel){

        return  9.0/5*cel+32;
    }
}
