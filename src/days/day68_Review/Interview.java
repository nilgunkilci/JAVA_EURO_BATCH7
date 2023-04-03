package days.day68_Review;

import java.util.Arrays;
import java.util.List;

public class Interview {
    public static void main(String[] args) {

        List<Integer> original = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 17, 359);
        task2(original);
        System.out.println();
        task3(original);

    }

    public static void task2(List<Integer> original) {
        for (int i = 0; i < original.size()-1; i++) {


            if (original.get(i) % 3 == 0)
                System.out.print(original.get(i) + ",");
        }
    }

    public static void task3(List<Integer> original) {

        int sum = 0;
        for (int i = 0; i < original.size()-1; i++) {
           if (i==0){
               sum =  original.get(i) + original.get(i + 1);
           }else {
               sum = original.get(i - 1) + original.get(i) + original.get(i + 1);
           }
            System.out.print(sum + ",");
        }
    }

}


