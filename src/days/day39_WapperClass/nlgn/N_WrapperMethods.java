package days.day39_WapperClass.nlgn;

public class N_WrapperMethods {
    public static void main(String[] args) {

        // Character Method lari

        // 1-- .isAlphabetic()  girilen karakterin alfabede olup olmadigini boolean deger olarak dondurur.
        System.out.println(" 'ß' alfabede bulunur mu? = " + Character.isAlphabetic('k'));

        // 2-- .isLetter()  karakterin bir harf olup olmadigini boolean deger olarak dondurur.
        System.out.println("'/' bir harf midir? = " + Character.isLetter('/'));

        // 3-- .isDigit() girilen karakterin bir sayi olup olmadigini boolean deger olarak dondurur.
        System.out.println(" 3 bir sayi midir?  = " + Character.isDigit('3'));

        System.out.println(Character.isSpaceChar('K'));


        // ORNEK: bir String ifade icindeki harf sayisini yazdiran bir method
        kacHarfVar("java  1995 *? ");

    }
    public static void kacHarfVar (String str){
        int sayac= 0;
        for (int i=0; i<str.length();i++){
             if (Character.isLetter(str.charAt(i))){
                 sayac++;
             }
        }
        System.out.println( str + " ifadesi icinde "+ sayac +" tane harf bulunur");
    }

}
