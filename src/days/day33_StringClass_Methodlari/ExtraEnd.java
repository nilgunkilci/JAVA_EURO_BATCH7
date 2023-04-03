package days.day33_StringClass_Methodlari;

public class ExtraEnd {
    public static void main(String[] args) {


        //7 Bir String in son iki karakterini 3 defa yazdir

        // 1. Yontem
        String kelime = "hallo";
        for (int i= 0; i<3;i++){
            System.out.print(  kelime.substring(kelime.length() - 2));
        }
        System.out.println( );

        // 2. Yontem

        System.out.println("kelime.substring(kelime.length()-2).repeat(3) = " + kelime.substring(kelime.length() - 2).repeat(3));

    }
}
