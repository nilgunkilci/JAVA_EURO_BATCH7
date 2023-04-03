package days.day14;

public class LastDigit {
    public static void main(String[] args) {

        int a=105;
        int b=23;

        // son rakamlari ayni ise true yazdir, degilse false yazdir.
        if (a%10==b%10){
            System.out.println(true);
        }else System.out.println(false);
    }
}
