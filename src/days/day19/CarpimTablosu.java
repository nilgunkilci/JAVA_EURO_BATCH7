package days.day19;

public class CarpimTablosu {
    public static void main(String[] args) {



        for (int sayi=1;sayi<=10;sayi++){
            if (sayi==6||sayi==9||sayi==10 ){
                System.out.println(sayi+"'lar Carpimi");
            }else {
                System.out.println(sayi+"'ler Carpimi");
            }

            for (int sayi1=1;sayi1<=10;sayi1++){

                System.out.println(sayi+" * "+sayi1+" = "+(sayi*sayi1));

        }
            System.out.println();
    }
}}
