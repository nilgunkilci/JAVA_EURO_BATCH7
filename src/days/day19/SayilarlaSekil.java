package days.day19;

public class SayilarlaSekil {
    public static void main(String[] args) {

        //  1
        //  1  2
        //  1  2  3
        //  1  2  3  4
        //  1  2  3  4  5
        //  1  2  3  4  5  6
        //  1  2  3  4  5  6  7
        //  1  2  3  4  5  6  7  8
        //  1  2  3  4  5  6  7  8  9
        //  1  2  3  4  5  6  7  8  9  10  sekli yazdirin

        for (int i=1;i<=10;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  "+j );
            }
            System.out.println();
        }


        //  1
        //  2  2
        //  3  3  3
        //  4  4  4  4
        //  5  5  5  5  5
        //  6  6  6  6  6  6
        //  7  7  7  7  7  7  7
        //  8  8  8  8  8  8  8  8
        //  9  9  9  9  9  9  9  9  9 sekli yazdirin

        for (int i=1; i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  "+i);
            }
            System.out.println();
        }
    }
}
