package days.day36_Review;

import java.util.Arrays;

public class RotateElements {
    public static void main(String[] args) {


        // Verilen bir Array in elementlerini donduren bir method olusturun
        // { 1,2,3} ===> { 2,3,1}

        int x[] = {1, 2, 3};
        int[] y ={12,22,35,12,41};
        int [] z= {0,5,0};

        System.out.println("Arrays.toString(x) = " + Arrays.toString(x));
        System.out.println("Arrays.toString(y) = " + Arrays.toString(y));
        System.out.println("Arrays.toString(z) = " + Arrays.toString(z));


        int[] yenix = rotate(x);
        System.out.println(Arrays.toString(yenix));

        System.out.println(Arrays.toString(rotate(y)));

        System.out.println(Arrays.toString(rotate(z)));

    }
    public static int[] rotate(int[] arr){

        int ilkElement = arr[0];

        for(int i=0; i<=arr.length-2; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = ilkElement;

        return arr;
    }
}
