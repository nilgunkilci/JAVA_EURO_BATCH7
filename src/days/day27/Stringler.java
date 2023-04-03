package days.day27;

public class Stringler {
    protected void finalize() throws Throwable {

        System.out.println("cop toplayicisi calisti");
        super.finalize();
    }

    public static void main(String[] args) {
        String sehir = "Istanbul";
        String yeniSehir = "Istanbul";
        System.out.println(yeniSehir == sehir);
        String city = new String("Istanbul");
        System.out.println(city == sehir);
        //immutable
        sehir = "Izmir";
        city = "Kars";
        city = new String("Mardin");
        String sehir5 = "Izmir";
        sehir = "Ankara";
        sehir5 = "Mardin";
        System.out.println(sehir5 == city);
        Stringler str = new Stringler();
        str.numara=99999;
        System.out.println("str.numara = " + str.numara);
        str = null;
        Stringler str1 = new Stringler();
        str1.numara = 7777777;
        str1 = null;
        str1 = new Stringler();
        str1 = str;

        System.gc();
          System.out.println("str.numara = " + str.numara);


    }

    int numara;
    int yil;
    String text;
}

