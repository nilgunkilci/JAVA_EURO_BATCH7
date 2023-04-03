package days.day39_WapperClass;

public class WrapperClass2 {

    public static void main(String[] args) {

        int num1 = 5;
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");
        Integer num4 = Integer.valueOf(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // valueof method ile yani eger ayni object mevcut ise onu tekrar kullanarak , object create ettigi icin  == operator sonucu true doner.
        // cunku bu sekilde valueof ile hafiza daha verimli kullanilir. ( String pool gibi bir hafiza)
        // equals() method ise objectlerin degerlerini karsilastirir.
        System.out.println(num2 == num3);  // true
        System.out.println(num2.equals(num3)); // true


        float f1 =25.5f;
        Float f2=Float.valueOf(25.5f);
        Float f3= Float.valueOf("25.5f");
        Float f4= Float.valueOf(f1);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);


        short s1=10;
        Short s2=Short.valueOf((short) 10); // byte range inde bir value argument olarak cast edilmesi gerekir
        Short s3=Short.valueOf("10");
        Short s4=Short.valueOf(s1);  // byte deger olarak olusturulmus variable cast gerekmeksizin argument olarak gonderilebilir
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        boolean bol1 = true;
        Boolean bol2 = Boolean.valueOf(false);
        Boolean bol3 = Boolean.valueOf("false");
        Boolean bol4 = Boolean.valueOf(bol1);
        System.out.println("bol1 = " + bol1);
        System.out.println("bol2 = " + bol2);
        System.out.println("bol3 = " + bol3);
        System.out.println("bol4 = " + bol4);


    }
}
