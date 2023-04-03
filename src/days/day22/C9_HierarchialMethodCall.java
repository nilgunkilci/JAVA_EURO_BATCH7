package days.day22;

public class C9_HierarchialMethodCall {
    public static void main(String[] args) {

        System.out.println("Main Method");
        displayMessage();
        System.out.println("Back to Main Method");

    }

    public static void displayMessage() {
        System.out.println("Hello World");
        calculation();
        System.out.println("Back to displaymessage Method");
    }

    public static void calculation() {
        System.out.println(10 * 5 / 2 + 1);

    }
}
