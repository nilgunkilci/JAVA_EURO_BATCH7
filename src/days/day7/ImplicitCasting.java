package days.day7;

public class ImplicitCasting {
    public static void main(String[] args) {

        // byte --> short ---> int ---> long ---> float ---> double

        int myInt = 9;
        double myDouble = myInt;   // Automatic casting : int---> double
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);
        System.out.println(myInt);  // outputs ---> 9
        System.out.println(myDouble);  //   outputs ---> 9.0

        int i = 100;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("l = " + l);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("i = " + i);
    }
}
