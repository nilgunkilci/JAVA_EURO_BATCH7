package days.day22;

public class C6_MethodWithloop {
    public static void main(String[] args) {

        System.out.println("Main method icerisindeyim");

        for (int i = 1; i <= 5; i++) {
            displayMessage();
            System.out.println("Tekrar main method icerisindeyim. dongu : " + i);
        }
        System.out.println("Son kez");
    }

    public static void displayMessage() {
        System.out.println(("displayMessage icerisindeyim"));
    }
}
