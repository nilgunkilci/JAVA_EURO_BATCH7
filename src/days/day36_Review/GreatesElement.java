package days.day36_Review;

import java.util.Arrays;

public class GreatesElement {
    public static void main(String[] args) {

        int[] x = {23, 45, 65, 21, 87, 34};

        System.out.println("Arrays.toString(greatest(x)) = " + Arrays.toString(greatest(x)));

    }

    public static int[] greatest(int[] x) {
        int max = 0;
        for (int i = 0; i < x.length; i++) {

            if (x[i] > max) {
                max = x[i];


            }
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = max;
        }

return x;
    }

}
