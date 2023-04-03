package days.day43_Review;



import java.util.ArrayList;
import java.util.Arrays;

public class FilterRange {

    public static void main(String[] args) {

        // Bir Liste icerisinde range olarak verilen araliktaki sayilari cikaran bir method yaziniz

        ArrayList<Integer> sayilar = new ArrayList<Integer>(Arrays.asList(1, 5, 7, 2, 8, 9, 12, 15, 11, 9, 4));

        int num1 = 5;
        int num2 = 10;

        System.out.println(sayilar.removeAll(FilterRange(num1, num2)));

        System.out.println(sayilar.toString());
    }

    public static ArrayList FilterRange(int a, int b) {
        ArrayList<Integer> FilterRange = new ArrayList<>();
        for (int i = a; i < b; i++) {
            FilterRange.add(i);


        }
        return FilterRange;
    }
}
