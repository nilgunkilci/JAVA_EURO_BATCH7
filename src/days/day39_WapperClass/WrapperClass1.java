package days.day39_WapperClass;

public class WrapperClass1 {

    public static void main(String[] args) {

        int num1 = 5;
        Integer num2 = new Integer(5);
        Integer num3 = new Integer("5");
        Integer num4 = new Integer(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // == operator u objectlerin ayni olup olmadigini, yani referans lari karsilastirir.
        // equals() method ise objectlerin degerlerini karsilastirir.
        System.out.println(num2 == num3);  // false
        System.out.println(num2.equals(num3)); // true

        double d1 = 25.5;
        Double d2 = new Double(25.5);
        Double d3 = new Double(25.5);
        Double d4 = new Double(d1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d1 + d2 + d3 + d4);  // aritmatik isleme girebiliyor

        char c1= 'c';
        Character c2= new Character('c');
        Character c3= new Character(c1);
        // Character c4=new Character("c");  Character e cift tirnak icinde yazilamaz
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        byte b1= 10;
        Byte b2=new Byte((byte) 10); // byte range inde bir value argument olarak cast edilmesi gerekir.
        Byte b3 = new Byte("10");
        Byte b4= new Byte(b1); // byte deger olarak olusturulmus variable  oldugu icin casting gerekmez.
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        boolean bol1= true;
        Boolean bol2= new Boolean(false);
        Boolean bol3= new Boolean("false");
        Boolean bol4= new Boolean(bol1);
        System.out.println(bol1);
        System.out.println(bol2);
        System.out.println(bol3);
        System.out.println(bol4);



    }
}
