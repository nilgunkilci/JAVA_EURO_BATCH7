package days.day58.OverLoading;

public class CompileTimePoly {


    // Compile Time Polymorphism / Static polymorphism / Method Overloading
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
