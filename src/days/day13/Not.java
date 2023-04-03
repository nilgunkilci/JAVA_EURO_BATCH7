package days.day13;

public class Not {
    public static void main(String[] args) {
        int not = 45;
        char derece = 'A';

        if (not >= 0 && not < 101) {
            System.out.println("distaki if body");

            if (not >= 85 ) {
                derece='A';

            } else if (not >= 70) {
                derece='B';

            } else if (not >= 50) {
                derece='C';

            } else if (not > 30) {
                derece='D';

            } else if (not >= 0) {
                derece='E';


            }

            System.out.println("distaki if block sonu");
        } System.out.println("dereceniz = " + derece);
        System.out.println("Tüm if ler bitti");
    }
}
