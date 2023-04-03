package days.day35_Arrays;

public class Arrays3 {
    public static void main(String[] args) {

        int[] sayilar= new int[]{55, 10, 7,16, 53, 22, 35, 40, 19, 100};

        // TASK 1 : dizideki max sayiyi bulunuz.
        int max= 0;
        for (int  sayi: sayilar){
             if (  sayi>max){
                 max= sayi;   // 5, 10, 16, 53
             }
        }
        System.out.println("max = " + max);

        // TASK 2 : dizideki en kucuk sayiyi yazdiriniz.
        int min= sayilar[0];
        for (int  sayi: sayilar){
            if (  sayi<min){
                min= sayi;

            }
        }
        System.out.println("min= " + min);

        // TASK 3: dizideki sayilarin toplamini yazdiriniz.

        int top=0;
        for (int sayi : sayilar) {
            top+=sayi;
        }
        System.out.println("top = " + top);
    }
    }

