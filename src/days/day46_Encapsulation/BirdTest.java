package days.day46_Encapsulation;

public class BirdTest {
    public static void main(String[] args) {

        Bird bird= new Bird();
        // bird.name= "Loko";           ** Bird class icinde variable lar private oldugu icin bu sekilde direk ulasilamaz

        // once set method ile atama yapiliyor. sonra get method ile variable i alabiliyoruz
        bird.setName("Loko");
        System.out.println("bird.getName() = " + bird.getName());
    }
}
