package days.GrupArbeit;

import java.util.Arrays;

public class yarisma {

    public static void main(String[] args) {

        String isim= "Aysegul";

       String [] harfler=new String[isim.length()];

        for (int i= 0; i<isim.length();i++){
            harfler[i]=  isim.charAt(i)+"-";

        }
        harfler.toString();
    }
}
