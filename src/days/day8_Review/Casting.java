package days.day8_Review;

public class Casting {
    public static void main(String[] args) {

        // task 1
        int pies = 10; int people = 4; //System.out.println(10/4); // 2
        double piesPerson;
        piesPerson = pies/people; // 10/4
        System.out.println("piesPerson = " + piesPerson); // 2.0

        // task 2
        int pies2 = 10; int people2 = 4; //System.out.println(10/4); // 2
        double piesPerson2;
        piesPerson2 = (double)pies2/people2; // 10.0/4.0
        System.out.println("piesPerson2 = " + piesPerson2); // 2.5

        // task 3
        int pies3 = 10; int people3 = 4; //System.out.println(10/4); // 2
        double piesPerson3;
        piesPerson3 = pies3/(double)people3; // 10.0/4.0
        System.out.println("piesPerson3 = " + piesPerson3); // 2.5

        // task 4
        int pies4 = 10; int people4 = 4; //System.out.println(10/4); // 2
        double piesPerson4;
        piesPerson4 = (double)(pies4/people4); // (double) (10/4) // implicitly oldugu icin casting e gerek yok
        System.out.println("piesPerson4 = " + piesPerson4); // 2.5

    }
}
