package days.day16_Review;

public class UniqueNumber {
    public static void main(String[] args) {

        int a, b, c;
        a = 4;
        b = 6;
        c = 6;
        int unique = (a == b && b == c) ? 1 : (a == b || b == c || a == c)?2:3;
        System.out.println("unique = " + unique);

        if (a == b && b == c) {
            unique = 1;

        } else if (a == b || b == c || a == c) {
            unique = 2;

        } else unique = 3;
        System.out.println("unique = " + unique);
    }
}
