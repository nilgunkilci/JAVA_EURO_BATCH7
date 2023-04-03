package days.day23;

public class C11_UniqueNumber2 {
    public static void main(String[] args) {



    // Write a method that finds the unique number among three numbers
    // 3 sayi icerisinde essiz sayi addedini bulan bir method yaziniz

    int num1 = 1;
    int num2 = 2;
    int num3 = 2;
    uniqueNumber(num1,num2,num3);

    uniqueNumber(1,2,3);

        System.out.println(uniqueNumber(424, 324, 324));

}

    public static int uniqueNumber(int a, int b, int c) {

        int sonuc;
        if (a == b && a == c) {
            sonuc = 1;
        } else if (a == b || a == c || b == c) {
            sonuc = 2;
        } else {
            sonuc = 3;
        }

        return sonuc;
    }
}
