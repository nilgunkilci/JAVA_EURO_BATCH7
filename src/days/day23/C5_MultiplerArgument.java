package days.day23;

public class C5_MultiplerArgument {
    public static void main(String[] args) {

        calculation(3, 6);
        int sayi1 = 34;
        int sayi2 = 36;
        calculation(sayi1,sayi2);


    }

    public static void calculation(int num1, int num2) {

        int total;
        total = num1 + num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Toplam deger : " + total);

    }
}
