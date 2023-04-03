package days.day18;

public class Faktoriyel {
    public static void main(String[] args) {
        // bir sayinin faktoriyel degerini bulan bir sayi yaziniz

        int f = 1;
        for (int i = 3; i > 1; i--) {
            f*=i;


        }
        System.out.println(f);
        int fak=1;
        int sayi=3;
        for (int i=1;i<=sayi;i++){
            fak *=i;
        }
        System.out.println("fak = " + fak);
    }


}
