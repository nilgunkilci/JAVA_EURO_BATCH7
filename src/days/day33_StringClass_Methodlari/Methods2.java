package days.day33_StringClass_Methodlari;

public class Methods2 {

    public static void main (String[] args){

        String sehir= "Istanbul";
        //             01234567

        System.out.println("sehir.substring(1) = " + sehir.substring(1));  // stanbul
        // substring methodu  belirtilen baslangicdan baslayarak  verilen string ifadeyi sonuna kadar yazdirir.

        System.out.println("sehir.substring(3) = " + sehir.substring(3));  // anbul
        System.out.println("sehir.substring(6) = " + sehir.substring(6));  // ul

        // substring methodu hem baslangic hem sonu belirleyebiliriz

        System.out.println("sehir.substring(2,5) = " + sehir.substring(2, 5)); // baslangic dahil ama son girilen index dahil degil.
                                                                                // bundan dolayi sonuc 2,3 ve 4. diziler yani tan olur


        String text= "Merhaba Java";
        //            01234567891011

        System.out.println("text.substring(8,text.lenght()) = " + text.substring(8, text.length()));  // Java
        System.out.println("text.substring(8) = " + text.substring(8));   // Java  son indexi belirtmek zorunda degiliz
        System.out.println("text.substring(0,8) = " + text.substring(0, 8));

        // String son 4 karakterini almak icin lenght -4 olur
        System.out.println("text.substring(text.length()-4) = " + text.substring(text.length() - 4));

         text= " Merhaba Istanbul";
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // tamami kucuk merhaba ıstanbul
        System.out.println("text.toUpperCase() = " + text.toUpperCase()); // tamami buyuk MERHABA ISTANBUL


    }
}
