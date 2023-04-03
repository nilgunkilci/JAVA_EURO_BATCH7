package days.day17;

public class WhileOrnek {
    public static void main(String[] args) {
        // 0 ile 50 arasindaki cift sayilari yanyana yazdirin.

        int i=1;
        while (i<50){

            System.out.print(" " + i);
            i++;
        }
        System.out.println('\n');
         i=0;
        while (i<50){
            i+=2;
            System.out.print(i+" ");
        }
        System.out.println('\n');
        System.out.println("-------------------------");
        System.out.println("Dünya");

    }
}
