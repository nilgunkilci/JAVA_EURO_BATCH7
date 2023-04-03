package days.day7;

public class ExpilicitCasting {

    public static void main(String[] args) {

        // double --> float ---> long ---> int ---> short ---> byte
        // cast operator ihtiyacimiz var. cünkü büyük data kücük dataya sikistiriliyor
        double myDouble = 9.78;
        int myInt = (int) myDouble;  // manual casting: double ---> int
        double myDouble2 = myInt;   // tekrar geriye döndürülemez

        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myDouble2 = " + myDouble2);
        double d = 100.4;
        long l = (long) d; // Expilicit Casting - data kaybi soz konusu
        int i = (int) l;  // Expilict Casting - data kaybi soz konusu degil
                          // ancak yine de otomatik yapilmiyor, casting gerekiyor
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);
    }
}
