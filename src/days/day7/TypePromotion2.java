package days.day7;

public class TypePromotion2 {
    public static void main(String[] args) {

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.4f;
        double d = 0.25353;

        double result = (f * b) + (i / c) + (d * s);
        System.out.println("result = " + result);
        int result2 = (int) result;
        System.out.println("result2 = " + result2);

        /////////////

        int i1 = 5;
        float f1 = 15.5f;
        double d1 = 20.5;
        long l1 = 20898798798798797l;

        float result3 = f1 + i1;
        long result4 = l1 + i1;
        double result5 = d1 + f1;

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);


    }
}



