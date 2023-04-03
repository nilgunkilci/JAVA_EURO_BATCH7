package days.day62;

import java.util.Scanner;

public class UserdefinedException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;


        boolean devam = true;
        while (devam) {
            System.out.println("Lütfen yasinizi giriniz : ");
            age = Integer.parseInt((scanner.nextLine()));
            if (age < 18) {
                System.out.println("Ysainiz bu araci kullanmaya uygun degildir. ");
            } else {
                devam = false;
                System.out.println("Yasiniz bu araci kullanmaya uygundur.");
            }
        }
    }
}
