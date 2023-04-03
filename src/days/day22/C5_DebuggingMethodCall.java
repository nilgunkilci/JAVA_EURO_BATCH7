package days.day22;

public class C5_DebuggingMethodCall {
    public static void main(String[] args) {

        System.out.println("Main method icerisindeyim: Line 6");
        method();
        System.out.println("Main method icerisindeyim: Line 8");
        method();
        System.out.println("Main method icerisindeyim: Line 10");
        method();
        System.out.println("Main method icerisindeyim: Line 12");
        method();
    }

    public static void method() {
        System.out.println("Method icerisindeyim : Line 15");
    }

}
