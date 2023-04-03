package days.day38;



import java.util.Arrays;

public class ArrayReview {
    /*
    Printing elements of an Array.
    1- For loop
    2- For each
    3- Arrays.toString() method
     */
    public static void forLoopPrint(String[] arr){
        System.out.println("arr = " + arr);
        System.out.println("Traversing given array with for...loop");
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "- Öğrenci = " + arr[i]);
        }
    }
    public static void forEachPrint(String[] arr){
        System.out.println("arr = " + arr);
        System.out.println("Traversing given array with for. each.loop");
        int i = 1;
        for (String ogrenci:arr) {
            System.out.println(i + "- Öğrenci = " + ogrenci);
            i++;
        }
    }
    public static void yanYanaYaz(String[] arr){
        for (String ogrenci:arr) {
            System.out.print(ogrenci + ", ");
        }
        System.out.println();
    }
    public static void buyukKucukYaz(String[] arr, boolean buyukMu){
        int i = 1;
        for (String ogrenci:arr) {
            if(buyukMu){
                System.out.println(i + "- Öğrenci = " + ogrenci.toUpperCase());
            } else{
                System.out.println(i + "- Öğrenci = " + ogrenci);
            }
            i++;
        }

    }
    public static void main(String[] args) {
        System.out.println("Arrays in Java.");
        String[] ogrListesi = {"Ahmet","Mehmet","Merry"};

        System.out.println("ogrListesi = " + ogrListesi);

        /*
        1. Yontem
        System.out.println("For loop");
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "- Öğrenci = " + ogrListesi[i]);
        }
        2. Yontem
        System.out.println("-------------------");
        System.out.println("For each....");
        int i = 1;
        for (String ogrenci:ogrListesi) {
            System.out.println(i + "- Öğrenci = " + ogrenci);
            i++;
        }*/


        // 3.Yontem
        System.out.println("-------------------");
        System.out.println("Arrays.toString() method");
        System.out.println(Arrays.toString(ogrListesi));



        System.out.println("--------------------");

        forLoopPrint(ogrListesi);
        forEachPrint(ogrListesi);
        yanYanaYaz(ogrListesi);

        buyukKucukYaz(ogrListesi,true);
        buyukKucukYaz(ogrListesi,false);
    }
}



