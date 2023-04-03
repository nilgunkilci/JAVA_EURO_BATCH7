package days.day36_Review;

public class SumOfElements {

    public static void main(String[] args) {

        // 2 tane elementlerinin toplami buyuk olan array i gosteren bir method yaziniz
        int[] x = {23, 45, 65, 21, 87, 34};
        System.out.println("enbuyukToplam(x) = " + enbuyukToplam(x));

    }
    public static int  enbuyukToplam(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+= arr[i];

        }return sum;
    }
    public static void enBuyukArray(int x,int y){

    }
}
