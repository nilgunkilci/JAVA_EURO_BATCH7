package days.day27;

public class Tekrar {
    protected void finalize() {
        System.out.println("garbage collector calisti");
        super.getClass();
    }

    int sayi;
    String text;

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 40;
        System.out.println("a = " + a);
        String str = "Merhaba";//string pool icinde
        String str1 = "Merhaba";//string pool icinde
        System.out.println(str == str1);
        String yeni = str;// Merhaba
        yeni = "Hello";
        System.out.println("str = " + str);
        Tekrar obj = new Tekrar();
        obj.sayi = 50;
        Tekrar obj2 = new Tekrar();
        obj2.sayi = 40;
        System.out.println("obj.sayi = " + obj.sayi);
        System.out.println("obj2.sayi = " + obj2.sayi);
        System.out.println("obj.text = " + obj.text);
        obj2.text = "Iyi aksamlar";
        System.out.println("obj2.text = " + obj2.text);
        Tekrar obj3;
        obj3 = obj2;
        System.out.println("obj3.sayi = " + obj3.sayi);
        obj3.sayi = 100;
        System.out.println("obj2.sayi = " + obj2.sayi);
        obj3 = null;
       obj2 = null;
        System.gc();
        /*int sayi = 20;
        String text = "Hello";
        System.out.println("obj3.sayi = " + obj3.sayi);
        System.out.println("sayi = " + sayi);

         */
    }

}
