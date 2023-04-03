package days.day22;

public class C2_ReuseMethod {
    public static void main(String[] args) {
        // Proje icinde ayni metodu defalarca cagirabiliriz.

        System.out.println("Ahmet geldi");
        selam();
        System.out.println("Zeynep geldi");
        selam();
        System.out.println("Cigdem geldi");
        selam();


    }

    public static void selam() {

        System.out.println("Selam");
    }
}
