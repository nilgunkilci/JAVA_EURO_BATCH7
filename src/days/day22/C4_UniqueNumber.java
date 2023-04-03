package days.day22;

public class C4_UniqueNumber {
    public static void main(String[] args) {

        // Write a method that finds the unique number among three numbers
        // 3 sayi icerisinde essiz sayi addedini bulan bir method yaziniz
        uniqueNumber();

    }

    public static void uniqueNumber() {
        int sayi1, sayi2, sayi3;
        sayi1 = 21;
        sayi2 = 22;
        sayi3 = 23;
        int unique;
        // ternary operator ile su sekilde yapilir
        //int unique = (sayi1 == sayi2 && sayi2 == sayi3) ? 1 : (sayi1 == sayi2 || sayi2 == sayi3 || sayi1 == sayi3)?2:3;
        //System.out.println("unique = " + unique);

        if (sayi1 == sayi2 && sayi2 == sayi3) {
            unique = 1;

        } else if (sayi1 == sayi2 || sayi2 == sayi3 || sayi1 == sayi3) {
            unique = 2;

        } else unique = 3;
        System.out.println("unique = " + unique);
    }
}
