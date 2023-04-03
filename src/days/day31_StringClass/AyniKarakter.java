package days.day31_StringClass;

public class AyniKarakter {

    public static void main(String[] args) {

        //
        String str= "ADANA";
        int sayac=1;
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)==str.charAt(0)){
                sayac++;
            }
        }
        System.out.println(str.charAt(0) +" "+ sayac+" kere tekrar ediyor");
    }
}
