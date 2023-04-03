package days.day42_Constructor2;

public class  BoxTest {
    public static void main(String[] args) {
        Box kutu = new Box();

        System.out.println("kutu.width = " + kutu.width);
        System.out.println("kutu.length = " + kutu.length);     // oncesinde atama yapilmadigi icin
        // sonuc data type larin default degerleri cikar


        Box kutu1 = new Box(15, 25);
        System.out.println("kutu1.length = " + kutu1.length);
        System.out.println("kutu1.width = " + kutu1.width);

        System.out.println("kutu1 alani = " + kutu1.araeCalculator());
        System.out.println("kutu alani = " + kutu.araeCalculator()); // bir deger atamasi yapilmadigi icin default o degeri cikar

        /*kutu1.showInfo();
       String bilgi = kutu1.strShowInfo();
        System.out.println(  bilgi);

         */

        System.out.println(kutu1);
        System.out.println(kutu);

        // farkli objelerin icerigi ayni olsa bile adresleri farkli oldugu icin esit midir sorusu false olur
        System.out.println("kutu.hashCode() = " + kutu.hashCode());
        System.out.println("kutu1.hashCode() = " + kutu1.hashCode());
        System.out.println("kutu1== kutu = " + (kutu1 == kutu)); // bunlar reference type cannot be compare with == operator.

        System.out.println("kutu1.esitMi(kutu) = " + kutu1.esitMi(kutu));
        kutu1 = kutu;
        System.out.println("kutu1.esitMi(kutu) = " + kutu1.esitMi(kutu));
    }
}
