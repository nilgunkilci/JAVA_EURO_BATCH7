package days.day39_WapperClass.tasks;

public class Task2 {
    public static void main(String[] args) {

        // Write a method that can find the minimum number from an int Array
        int [] numbers = {23,45,76,91,112,62,144};

        minNumber(numbers);
    }
    public static void minNumber(int [] sayilar){
        int min= Integer.MAX_VALUE;
        for (int i = sayilar.length-1; i >=0; i--) {
            // System.out.println("sayilar[i] = " + sayilar[i]);
            if (sayilar[i]<min){
                min= sayilar[i];

            }
        }
        System.out.println("min = " + min);

    }
}
