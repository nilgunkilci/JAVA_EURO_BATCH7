package days.day4;

public class Declaration {

    public static void main(String[]args){

        int numara = 123456; // bu sekilde de yazilabilir.
         /* ya da bu sekilde
        iki adimda yazilabilir*/
        int no;
        no =987;
        System.out.println("no = " + no);

        // byte short int long
        byte sayi = 20; // ondalik sayi almaz
        short s = 2000;
        int i = 2000000;
        long l = 20000000000000000l;
        System.out.println(sayi);
        System.out.println("sayi = " + sayi);
        System.out.println(s);
        System.out.println("s = " + s);

        int a,b,c;  // ayni int altinda aralara virgül koyarak atama yapilabilir
        a =10;
        b=20;
        c=30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        byte b1= -20;
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        short s1 = -200;
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        int i1 = 500;
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        long l1 = 500000;
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("i1 = " + i1);
    }
}
