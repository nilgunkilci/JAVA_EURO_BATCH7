package days.day9;

public class Unary2 {

    public static void main(String[] args) {

        int numara = 20;
        numara++;
        System.out.println("numara = " + numara);

        ++numara;
        System.out.println("numara = " + numara);

        int b = numara;
        System.out.println("b = " + b);

        b = ++numara;
        System.out.println("b = " + b);
        b = numara++;
        System.out.println("b = " + b);
        System.out.println("numara = " + numara);



    }
}
