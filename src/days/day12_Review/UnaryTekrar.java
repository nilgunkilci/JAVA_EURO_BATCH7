package days.day12_Review;

public class UnaryTekrar {

    public static void main(String[] args) {

        // incrment (artis) , decrement(azalma)

        int a = 10;

        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
        --a;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);
        System.out.println(a++ + a++ + a++);
        System.out.println("a = " + a);
        a = 10;
        System.out.println(a++ + ++a * 2); // 10+12*2
        System.out.println("a = " + a);

        a = 10;
        int b = a++;
        int c = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        int not = 96;
        int sinif = 5;
        if (not > 75) {
            ++sinif;
            System.out.println("sinif = " + sinif);
        }

        if (not > 95) {
            ++not;
            System.out.println("not = " + not);
        }

    }}

