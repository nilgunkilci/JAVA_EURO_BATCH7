package days.day18;

public class ForLoop3 {
    public static void main(String[] args) {

        // o dan 30 a kadar olan tek  sayilarin toplamini yazdiran for loop olusturun
        int sonNokta = 30;
        int toplam = 0;
        for (int i = 1; i < sonNokta; i += 2) {
            toplam+=i;
        }
        // 1 + 3 + 4 + 5......=225
        System.out.println("toplam = " + toplam);

    }
}
