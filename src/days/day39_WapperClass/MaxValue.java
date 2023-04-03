package days.day39_WapperClass;

public class MaxValue {

    public static void main(String[] args) {

        // Bir Array icerisinde en buyuk degeri bulan bir method yaziniz

        int[] numbers ={123, 543, 6789, 54321};
        System.out.println(  maxValue(numbers));

    }

    public static int maxValue(int[] arr){
        Integer max= Integer.MIN_VALUE;
        for(int each: arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }
}
