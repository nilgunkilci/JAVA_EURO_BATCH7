package days.day33_StringClass_Methodlari;

public class Methods3 {
    public static void main(String[] args) {

        String text = "Ey edip adanada pide edip ye";

        String sehir= "Canakkaklke";
        //             012345678
        System.out.println("sehir.indexOf('k') = " + sehir.indexOf('k')); // k nin index nosunu verir
        System.out.println("sehir.lastIndexOf('k') = " + sehir.lastIndexOf('k')); // en son k nin index nosunu verir.
        System.out.println("sehir.indexOf('a') = " + sehir.indexOf('a')); // a nin index nosunu verir.
        System.out.println("sehir.indexOf('z') = " + sehir.indexOf('z')); //  z String icinde olmadigi icin -1 doner
        System.out.println("text.indexOf(\"edip\") = " + text.indexOf("edip"));
        System.out.println("sehir.indexOf(\"kale\") = " + sehir.indexOf("kale"));
        System.out.println("sehir.indexOf('a') = " + sehir.indexOf('a'));
        System.out.println("sehir.lastIndexOf('a') = " + sehir.lastIndexOf('a'));
        System.out.println("sehir.indexOf('a',2) = " + sehir.indexOf('a', 2));
        System.out.println("text.indexOf(\"edip\") = " + text.indexOf("edip"));
        System.out.println("text.lastIndexOf(\"edip\") = " + text.lastIndexOf("edip"));

        System.out.println("text.substring(text.indexOf(\"edip\"),text.lastIndexOf(\"edip\")) = " + text.substring(text.indexOf("edip"), text.lastIndexOf("edip")));

        String aranan= "  edip  ";
        System.out.println("text.indexOf(aranan) = " + text.indexOf(aranan)); // bosluklar oldugu icin sonucu bulamiyor ve -1 dönüyor

        System.out.println("text.indexOf(aranan.trim()) = " + text.indexOf(aranan.trim()));
        // trim methodu bosluklari silerek sadece bosluk harici kelimeleri kullaniyor.

    }
}
