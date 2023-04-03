package days.day13;

public class NestedOrnek {
    public static void main(String[] args) {

        int sayi = 60;
        if (sayi % 2 == 0) {
            System.out.println("sayi 2 ye kalansiz bölünüyor");
            if (sayi % 3 == 0) {
                System.out.println("sayi 3 e kalansiz bölünür");
                System.out.println("sayi 6 ya kalansiz bölünür.");
            }
            if (sayi % 5 == 0){
                System.out.println("sayi 10 a kalansiz bölünür");
            }
        }
        System.out.println("if ler bitti");
    }
}

