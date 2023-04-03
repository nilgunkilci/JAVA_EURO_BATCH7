package days.day18;

public class CiftTekFarki {
    public static void main(String[] args) {

        // 1000 e kadar olan sayilardan cift olanlarin toplami ile tek olanlarin toplaminin farkini bulan bir program yaziniz.

        int tekTop=0;
        int ciftTop=0;
        for (int i=0;i<=1000;i++){
            if (i%2==0){
              ciftTop+=i;
            }else {
                tekTop+=i;
            }

        } int fark=tekTop-ciftTop;
        System.out.println("fark = " + fark);
    }
}
