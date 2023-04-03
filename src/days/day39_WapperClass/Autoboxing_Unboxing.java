package days.day39_WapperClass;

public class Autoboxing_Unboxing {

    public static void main(String[] args) {

        // Autoboxing --> primitive to wrapper

        Integer num1= 123;
        int num2= 12;
        Integer num3=num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        // Unboxing --> wrapper to primitive

        Double d1= Double.valueOf(23.5);
        double d2=d1;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d1+d2 = " + d1 + d2); // Wrapper double ile primitive double matematiksel isleme tabi tutulamaz.

        int number1= new Integer(123);
        // Primitive       wrapper          // wrapper to primitive yani UNBOXING
        System.out.println(number1);

        Integer numner2= new Integer(123);  // No boxing

        int number3= numner2;   // wrapper to primitive yani UNBOXING
        System.out.println(number3);
        Integer number4 =Integer.valueOf(123);
        System.out.println(number4);
        //  Double number5= number4;   Wrapper objectler arasi autocasting assignment ile soz konusu degil

    }
}
