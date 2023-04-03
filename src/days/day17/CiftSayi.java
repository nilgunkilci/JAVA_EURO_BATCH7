package days.day17;

public class CiftSayi {
    public static void main(String[] args) {

        int i = 0;
        while (i < 50 && i % 2 == 0) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\n");

        //------------
        i = 1;
        while (i < 50 && i % 2 != 0) {

            System.out.print(i + " ");

            i+=2;
        }
        System.out.println("\n");
        //_______________________________________
        i=0;
        int son=50;
        while (i<son ){
            if (i%6==0){
                System.out.print(i+" ");
            }

            i+=3;

        }

    }
}
