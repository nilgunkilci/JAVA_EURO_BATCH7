package days.day37_Arrays;

import java.util.Arrays;

public class IkiBoyutluArrayler {
    public static void main(String[] args) {

        String[] birinciGrrup = new String[3];

        birinciGrrup[0] = "Ali";
        birinciGrrup[1] = "Ayse";
        birinciGrrup[2] = "Burak";

        // birinciGrup      Ali           Ayse          Burak         Umut
        // ikinciGrup       Mehmet        Hamza         Fatma         Cetin
        // ucuncuGrup       Elif          Esref         Emre          Bayram

        String[] sinif[] = new String[3][4];
        System.out.println("Arrays.deepToString(sinif) = " + Arrays.deepToString(sinif));
// sadece ali yi atadigimiz icin diger elementler null degeri alir
        // Arrays.deepToString(sinif) = [[null, null, null, null, null],
        // [null, null, null, null, null],
        // [null, null, null, null, null],
        // [null, null, null, null, null]]
        sinif[0][0] = "ALI";
        sinif[0][1] = "Ayse";
        sinif[0][2] = "Burak";
        sinif[0][3] = "Umut";

        System.out.println("Arrays.toString(sinif[0]) = " + Arrays.toString(sinif[0]));

        System.out.println("sinif[0][0].toLowerCase() = " + sinif[0][0].toLowerCase()); // sinif array i String olarak olustugu icin
        // String methodlari kullanabiliriz

        sinif[1][3] = "Cetin";
        sinif[1][2] = "Fatma";
        sinif[1][1] = "Hamza";
        sinif[1][0] = "Mehmet";
        System.out.println("Arrays.toString(sinif[1]) = " + Arrays.toString(sinif[1]));
        System.out.println("Arrays.deepToString(sinif) = " + Arrays.deepToString(sinif));// tum array i yazdirmak icin deeptoString method u kullaniyoruz

        sinif[2][0] = "Elif";
        sinif[2][1] = "Esref";
        sinif[2][2] = "Emre";
        sinif[2][3] = "Bayram";
        System.out.println("Arrays.toString(sinif[2]) = " + Arrays.toString(sinif[2]));

        // Array in tum elementlerini yazdirmak icin for loop kullaniyoruz

        Arrays.toString(sinif[0]);
        Arrays.toString(sinif[1]);
        Arrays.toString(sinif[2]);
        for(int i=0;i<sinif.length;i++){
            System.out.println("Arrays.toString(sinif[i]) = " + Arrays.toString(sinif[i]));
            for (int n=0;n<sinif[i].length;n++){
                System.out.println(" sinif[i][n] = " + sinif[i][n]);
            }
        }
    }
}
