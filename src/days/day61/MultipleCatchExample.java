package days.day61;

public class MultipleCatchExample {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};
        int x= 10;
        int y = 0;
        int result = x/ y; // division by zero trows Aritmetic Eception
        System.out.println("result = " + result);

        System.out.println(" Number at index 5 " + numbers[5] );  // ArrayOutBoundOfException
    }
}
