package days.day43_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class MinToFront {
    public static void main(String[] args) {



        // Liste icerisinde bulunan en kucuk sayiyi listenin en basina yerlestiren bir method yaziniz

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(45,74,1,98,3,56,887,12,2,46));

        System.out.println(minToFront(numbers).toString());

    }

    public static ArrayList minToFront(ArrayList<Integer> nums){

        int min = Integer.MAX_VALUE;
        int position = -1;

        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) < min){
                min = nums.get(i);
                position = i;
            }
        }
        nums.remove(position);
        nums.add(0, min);

        return nums;
    }



    }

