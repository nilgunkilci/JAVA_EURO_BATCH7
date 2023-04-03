package days.day34_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlisVerisListesi {
    public static void main(String[] args) {



        Scanner input= new Scanner(System.in);
        String  alisVerisListeniz []=new String[5];



        for (int i= 0; i<5;i++){

            System.out.println(" Lutfen bir urun giriniz");

             alisVerisListeniz[i]= input.nextLine();
            System.out.println(alisVerisListeniz[i]);


        }
        System.out.println(" alisVerisListeniz = " + Arrays.toString(alisVerisListeniz));

    }
}
