package days.day9;

public class UnarySoru {
    public static void main(String[] args) {

        int no = 5;
        int n2 = -2;
        n2 = no++;
        System.out.println("n2 = " + n2);
        System.out.println("no = " + no);
        int i = 3;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

        int a = 30;
        int b = --a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int r = 6;
        System.out.println("r = " + r++);
        System.out.println("r = " + r);
        int x = 6;
        System.out.println("x = " + x--);
        System.out.println("x = " + x);
        int y = 6;
        System.out.println("y = " + ++y);
        int p = 6;
        System.out.println("p = " + --p);
    }
}
