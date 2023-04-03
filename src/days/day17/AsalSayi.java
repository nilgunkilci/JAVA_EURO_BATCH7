package days.day17;

public class AsalSayi {
    public static void main(String[] args) {

        int num = 17;
        int kontrol = 2;
        int sayac = 0;
        while (kontrol < num) {
            if (num % kontrol == 0) {
                System.out.println(num + " , " + kontrol + " sayisina tam bölünür");
                sayac++;
            }
            kontrol++;
        }
        if(sayac==0){
            System.out.println(num+" sayisi asal bir sayidir.");
        }
        else {
            System.out.println(num+" sayisi asal bir sayi degildir .");
        }


    }
}
