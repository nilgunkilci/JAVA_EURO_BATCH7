package days.day35_Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

        int [] sayilar ;
        sayilar= new int[5];
        sayilar[0]= 1;
        sayilar[1]= 4;
        sayilar[2]= 5;

        String [] sehirler= {"Istanbul", "Edirne", "Mardin", "Artvin", "Trabzon"};
        double[] d = new double[]{0.5, 2.8, 3, 4.5 };
        System.out.println("sayilar.length = " + sayilar.length);
        System.out.println("sehirler.length = " + sehirler.length);
        System.out.println("d.length = " + d.length);

         System.out.println("sayilar = " + Arrays.toString(sayilar));
        System.out.println("sehirler = " + Arrays.toString(sehirler));
        System.out.println("d = " + Arrays.toString(d));
        d[2]=77.7;
        System.out.println("d  yeni dizi = " + Arrays.toString(d));


    }
}
