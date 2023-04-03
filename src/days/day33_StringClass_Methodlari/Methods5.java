package days.day33_StringClass_Methodlari;

public class Methods5 {
    public static void main(String[] args) {


        String text = "ey edip adanada pide ye";
        System.out.println("text.contains(\"edip\") = " + text.contains("edip")); // true
        System.out.println("text.contains(\"edip1\") = " + text.contains("edip1")); // false
        System.out.println("text.contains(\"ada\") = " + text.contains("ada"));
        System.out.println("text.contains(\"a\") = " + text.contains("a")); // char olarak aratmiyor. cift tirnak icinde arat
        char harf='a';
        System.out.println("harf = " + (int)harf);

        System.out.println("text.indexOf(97) = " + text.indexOf(97));
        System.out.println("text.replace(\"edip\",\"ali\") = " + text.replace("edip", "ali"));
        // replace methodu istenilen bolumu degistiriyor.
        // fakat bizi asil Stringimizin aslini bu methodlar degistirmiyor.
        System.out.println("text = " + text);// ey edip adanada pide ye
        // orjinali degistirmek istiyorsaniz atama yapmamiz gerek.
        text = text.replace("adana","bursa");
        System.out.println("text = " + text);

        String ali = "Ali";
        String veli = "Veli";
        System.out.println(ali + veli); // bu islem concation dir. bunu biz concat methodu ile de yapabiliriz
        System.out.println("ali.concat(veli) = " + ali.concat(veli));
        System.out.println(ali);

        //  BU METHODLAR ATAMA YAPMADIGIMIZ SURECE KAYNAGIMIZIN ORJINALINI DEGISTIRMEZ
        System.out.println("ali.concat(\" \",veli) = " + ali.concat(" "+ veli));
        System.out.println("ali.equals(veli) = " + ali.equals(veli));
        System.out.println("ali.equals(\"Ali\") = " + ali.equals("Ali"));
        String ali2=new String("Ali");
        System.out.println("ali.equals(ali2) = " + ali.equals(ali2)); // true equals method sadece icerigi karsilastirir.
                                                                    // bundan dolayi her karaktere dikkat etmekm lazim.
                                                                    // ozellikle bosluklara dikakat et.
        System.out.println("ali==ali2 = " + ali == ali2); // false cunku hafizadaki yerleri farkli
        boolean alilerEsitMi= ali.equals(ali2);
        System.out.println("alilerEsitMi = " + alilerEsitMi);


    }
}
