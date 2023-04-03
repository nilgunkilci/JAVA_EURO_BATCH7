package days.day18;

public class BölmeLoop {
    public static void main(String[] args) {


        // 1 den 100 e kaadar 5 bölünebilen sayilari bastirin

        for (int i=5;i<=100; i+=5){
            System.out.print(i+",");
        }
        System.out.println();

        for (int i=1;i<=100;i++){
            if (i%5==0){
                System.out.print(  i+",");
            }
        }
        System.out.println();

        for (int i=0;i<50;i++){
            System.out.print("-");
        }
    }
}
