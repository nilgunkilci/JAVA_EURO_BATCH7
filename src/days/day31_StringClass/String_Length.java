package days.day31_StringClass;

public class String_Length {
    public static void main(String[] args) {

        // .length methodu String in uzunlugunu verir. Cunku String aslinda bir Char dizisi (Array) dir.
        String str = "Eurotech Study";
        System.out.println(str.length());
        int uzunluk =str.length();
        System.out.println("uzunluk = " + uzunluk);
        String str2= "     ";
        System.out.println(str2.length());

        int carpim = str.length()*5;
        System.out.println(carpim);


    }
}

