package days.day39_WapperClass.tasks;

public class Task1 {

    // Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        int [] numbers = {23,45,76,91,112,62,144};
      maxNumber(numbers);

    }
    public static void maxNumber(int[] sayilar){
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < sayilar.length; i++) {
            // System.out.println("sayilar[i] = " + sayilar[i]);
            if (sayilar[i]>max){
                max= sayilar[i];

            }
        }
        System.out.println("max = " + max);


    }
}
