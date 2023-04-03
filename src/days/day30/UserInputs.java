package days.day30;


import java.util. *; // * isareti util class icindeki tüm methodlarin kullanimini saglar

public class UserInputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir byte deger giriniz");
        byte b=sc.nextByte();
        System.out.println("Girdiginiz byte deger = " + b);

        System.out.println("Bir short deger giriniz");
        short s=sc.nextShort();
        System.out.println("Girdiginiz short deger = " + s);

        System.out.println("bir integer deger giriniz");
        int i= sc.nextInt();
        System.out.println("Girdiginiz integer deger  = " + i);

        System.out.println(" Bir long deger giriniz");
        long l=sc.nextLong();
        System.out.println("Girdiginiz long deger = " + l);

        System.out.println("Bir double deger giriniz");
        double d=sc.nextDouble();
        System.out.println("Girdiginiz double deger = " + d);

        System.out.println("Bir boolean deger giriniz");
        boolean bool=sc.nextBoolean();
        System.out.println("Girdiginiz boolean deger = " + bool);

        // Dogru olmayan data tipi ile input gonderildiginde InputMismatchExeption aliyoruz





    }
}
