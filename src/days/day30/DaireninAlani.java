package days.day30;

import java.util.Scanner;
import java.util.SortedMap;

public class DaireninAlani {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dairenin yari caoini giriniz");

        double yariCap = sc.nextDouble();
        double daireninalani = yariCap * yariCap * Math.PI;

        System.out.println("daireninalani = " + daireninalani);
    }
}
