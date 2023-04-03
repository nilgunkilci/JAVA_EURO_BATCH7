package days.day23;

public class C6_UniqueNumber {
    public static void main(String[] args) {


        // Write a method that finds the unique number among three numbers
        // 3 sayi icerisinde essiz sayi addedini bulan bir method yaziniz

        unique(3,6,7);
        unique(34,34,35);
        unique(2,2,2);


    }
    public static void unique(int a,int b,int c){
        int unique;

        if (a == b && a == b) {
            unique = 1;

        } else if (a == b || b == c || a == c) {
            unique = 2;

        } else unique = 3;
        System.out.println("unique = " + unique);
    }
}
