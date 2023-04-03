package days.day34_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class urunBulma {
    public static void main(String[] args) {

        // kullanicidan bir urun alip,
        // istenen urunun markette olup olmadigini kontrol edip bildiren bir progaram yaziniz

        String[] urunler = {"Ekmek", "Peynir", "Zeytin", "Recel", "Bal"};

        Scanner sc = new Scanner(System.in);
        System.out.println(" Istediginiz urunu giriniz");
        String talep = sc.nextLine();

        Boolean flag = false;
        for (int i = 0; i < urunler.length; i++) {
            if (talep.equalsIgnoreCase(urunler[i])) { // equalsignorecase, kucuk buyuk harf ayrimi yapmadan esitlik sorgular
                flag = true;
            }
        }

        // .binarySearch methodu, girilen verinin dizi icindeki index numarasini verir.
        System.out.println("Arrays.binarySearch(urunler,talep) = " + Arrays.binarySearch(urunler, talep));

        if (flag) {
            System.out.println("Aradiginiz ürün  " + talep + " listemizde mevcuttur");

        } else System.out.println("Üzgünüz aradiginiz ürün  " + talep + " listemizde mevcut bulunmamaktadir");
    }
}

