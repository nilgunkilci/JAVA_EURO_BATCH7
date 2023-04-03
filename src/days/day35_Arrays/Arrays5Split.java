package days.day35_Arrays;

import java.util.Arrays;

public class Arrays5Split {
    public static void main(String[] args) {
        String text = "Merhaba Java bugun arrayler calisiyoruz";

        String [] bolunmusText = text.split(" ");
        System.out.println(bolunmusText.length);
        System.out.println(Arrays.toString(bolunmusText));

        String  macSonucu = "Fas=1, Fransa=1";
        String [] fasFransa= macSonucu.split(",");
        System.out.println(fasFransa.length);
        System.out.println(fasFransa[0]);
        System.out.println(fasFransa[1]);
        System.out.println(Arrays.toString(fasFransa));

    }
}
