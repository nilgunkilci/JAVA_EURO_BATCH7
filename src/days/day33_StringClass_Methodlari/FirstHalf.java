package days.day33_StringClass_Methodlari;

public class FirstHalf {
    public static void main(String[] args) {


        // verilen String in yarisini yazdir

        String str = "Denizli";
        //            0123456
        System.out.println("str.substring(0,str.length()/2) = " + str.substring(0, str.length() / 2));

        System.out.println("str.substring(0,str.length()/2) = " + str.substring(0, str.length() / 2));

        str= "HATAY";
        // ortadaki karakteri yazdirmak icin
        System.out.println("ortadaki karakter = " + str.charAt(str.length() / 2));
    }
}
