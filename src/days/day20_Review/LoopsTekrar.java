package days.day20_Review;

public class LoopsTekrar {
    public static void main(String[] args) {
        for (int i=0;i<3;++i){
            System.out.println("i = " + i);

        }

        for (int i=0;i<5;++i){
            for (int j=0;j<5;++j){
                if (j==0){
                    System.out.println("    *");
                } else if (j==1) {
                    System.out.println("   * *");

                } else if (j==2) {
                    System.out.println("  * * *");

                } else if (j==3) {
                    System.out.println(" * * * *");

                }else
                System.out.print("* * * * *");
            }
            System.out.println();
        }

         /*   int n=5;
        for (int i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space

        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }}*/

        System.out.println(); //ending line after each row
    }
}
