package days.day39_WapperClass.nlgn;

public class N_WrapperToPrimitive {
    public static void main(String[] args) {

        // Wrapper object leri , primitive data type lara atama yapabiliriz.
        // .intValue()       .doubleValue()     .booleanValue()     .charValue()
        // .shortValue()     .byteValue()       .longValue()        .floatValue()

        Integer obj1= Integer.valueOf("345"); // object ister cift tirnak ile olusturulsun farketmez
        int sayi1= obj1.intValue();
        System.out.println("sayi1 = " + sayi1);

        Double obj2= Double.valueOf("45.56");
        double sayi2=obj2;      // Method kullanmadan da atama yapilabilir fakat data turune dikkat etmek gerekli
        System.out.println("sayi2 = " + sayi2);
        int sayi3= obj2.intValue(); // NOT: bir objeyi farkli  birkac data turlerine , uygun bir method kullanarak atama yapabiliriz.
    }
}
