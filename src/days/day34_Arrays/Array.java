package days.day34_Arrays;

public class Array {
    public static void main(String[] args) {
        // Array deklare etme
        // 1. yol
        int[] sayilar;
        String[] kelimeler;
        double[] oranlar;

        // 2. yol
        int sayilar2[];
        String kelimeler2[];
        double oranlar2[];

        // Array create etme
        // 1. yol / farkli statementlar ile olusturma
        int[] sayilar3;
        sayilar3 = new int[5];

        // 2. yol / ayni statement icinde olusturma
        int[] sayilar4 = new int[5];

        // int[5] sayilar5 = new int[]; error

        // Array elementler ulasma
        int[] sayilar6 = new int[5];

        // 1 2 3 4 5

        // Array elementlerine deger assign etme
        sayilar6[0] = 10; // 1. element
        //sayilar6[1] = 5; // 2. element
        sayilar6[2] = 5; // 3. element
        //sayilar6[3] = 5; // 4. element
        sayilar6[4] = 5; // 5. element

        // Array elementlerinin degerlerine ulasma
        System.out.println(sayilar6[0]);
        System.out.println(sayilar6[1]);
        System.out.println(sayilar6[2]);
        System.out.println(sayilar6[3]);
        System.out.println(sayilar6[4]);

    }
}
