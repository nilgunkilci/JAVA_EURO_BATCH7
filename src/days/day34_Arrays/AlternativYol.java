package days.day34_Arrays;

public class AlternativYol {
    public static void main(String[] args) {
        // 1. yontem
        int [] numbers;

        // 2, yontem
        int numbers2 [];

        // 3. yontem
        int [] numbers3,numbers4,numbers5;

        // 4. yontem
        int numbers6  ,numbers7, numbers8[];

        // 5. yontem
        int numbers9[], numbers10[], numbers11[];


        int [] myArray = {10, 25, 35, 45, 55};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        // System.out.println(myArray[5]); out of bounds hatasi

        myArray[2]= 135;  // Array icerisindeki degisken yeniden deger assign edilebilir
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);

         int [] myList;
        myList= new int[]{1, 2, 3};
        /*

         int [] myList;
        myList=  {1, 2, 3};Bu sekilde ayri statementlarda Array a assign yapilamaz
        bundan dolayi ayni statement da atama yapilmali
        ya da new int[] eklenmeli
         */


    }
}
