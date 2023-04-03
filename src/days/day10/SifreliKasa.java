package days.day10;

public class SifreliKasa {
    public static void main(String[] args) {

        int a=2;
        int b=3;
        int c=4;
        int a1=4;
        int b1=3;
        int c1=4;
       boolean kasa = a1==a && b1==b && c1==c;
        System.out.println("kasa = " + kasa);


             /*
        Uc sifre ile acilan bir kasa programi yazin
        Verdiginiz degerlere gore kasanin acilip acilmadigini
        Consolda yazdirin
         */

        System.out.println("Lutfen Sifrenizi Girin!");

        boolean sifre1 = true;
        boolean sifre2 = true;
        boolean sifre3 = true;

        boolean kasaAcildi;
        kasaAcildi = sifre1 && sifre2 && sifre3;

        System.out.println("kasaAcildi mi = " + kasaAcildi);
    }
}
