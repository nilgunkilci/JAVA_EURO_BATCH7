package days.day35_Arrays;

import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {

        String [] kulupler= { "Real Madrid", "Sporting Lisbon", "Werde Bremen", "Bayern Munih"};
        String ispanya = kulupler[0];
        System.out.println("ispanya = " + ispanya);
        String[] arrayIspanya = ispanya.split(" ");
        System.out.println("Arrays.toString(arrayIspanya) = " + Arrays.toString(arrayIspanya));
        System.out.println("arrayIspanya[1] = " + arrayIspanya[1]);
        String[] sehirler = new String[kulupler.length];

        int i=0;
        for (String kulup: kulupler){
            System.out.println(kulup);
            String[] takim=kulup.split(" ");
            sehirler[i]= takim[1];
         i++;
        }

        System.out.println("Arrays.toString(sehirler) = " + Arrays.toString(sehirler));


    }
}
