package days.day9;

public class MutlakaSor {
    public static void main(String[]args){

         //ÖRNEK 17 ----> 392 / 10 % 10 / 2

        int sonuc17= 392 / 10 % 10 / 2;
        System.out.println("sonuc17 = " + sonuc17); // 39%10/2 --> 9/2 -->  sonuc 4

        // double type atama yaparsak ve casting yaparsak
        double sonuc1717= (double)392 / 10 % 10 / 2; // 39.2%10/2--->9.2
        System.out.println("sonuc1717 = " + sonuc1717);
        float d1= (float) 39.2%10/2f;
        System.out.println("d1 = " + d1);
    }
}
