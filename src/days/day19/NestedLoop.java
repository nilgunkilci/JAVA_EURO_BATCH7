package days.day19;

public class NestedLoop {
    public static void main(String[] args) {

        for (char A = 'A'; A < 'D'; A++) {
            System.out.println("dis döngü : " + A);
            System.out.println("_________________");
            for (int j = 1; j <3; j++) {
                System.out.print(   j+" , ");

            }            System.out.println("\n");

            System.out.println("_________________");
        }
    }
}
