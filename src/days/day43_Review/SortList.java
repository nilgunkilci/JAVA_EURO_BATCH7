package days.day43_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(43,12,65,99,3,52,8,39));

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("John", "Mike", "Adam", "Tom"));

        System.out.println(numbers.toString());

        Collections.sort(numbers); // sayi dizisini kucukten buyuge siraliyor.
        System.out.println(numbers.toString());

        Collections.sort(strings);
        System.out.println("strings = " + strings.toString());


    }
}
