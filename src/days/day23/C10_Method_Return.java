package days.day23;

public class C10_Method_Return {
    public static void main(String[] args) {

        int total = calculation(10, 20);
        System.out.println(total);
        total += total;
        System.out.println("total = " + total);
    }

    public static int calculation(int num1, int num2) {

        int total;
        total = num1 + num2;

        return total;
    }
}
