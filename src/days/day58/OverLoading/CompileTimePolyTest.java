package days.day58.OverLoading;

public class CompileTimePolyTest {

    public static void main(String[] args) {

        // Compile Time Polymorphism / Static polymorphism / Method Overloading
        System.out.println(CompileTimePoly.multiply(5,10));
        System.out.println(CompileTimePoly.multiply(5,10,100));
        System.out.println(CompileTimePoly.multiply(5.0,10.0));
    }
}
