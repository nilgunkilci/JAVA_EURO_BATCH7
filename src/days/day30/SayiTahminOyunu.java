package days.day30;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 30 arasi bit rakam tahmin ediniz!");
        int input;
        int gizliSayi = 15;
        int sayac = 0;

        do{
            input = sc.nextInt();

            if(input < gizliSayi){
                System.out.println("Daha buyuk bir rakam girin");
            }else if(input > gizliSayi){
                System.out.println("Daha kucuk bir rakam girin");
            }else{
                System.out.println("Tebrikler sayiyi buldunuz");
            }

            sayac++;

        }while(input != gizliSayi);

        System.out.println("Sayiyi " + sayac + " nci denemede buldunuz");
    }
}


