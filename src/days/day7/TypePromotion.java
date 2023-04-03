package days.day7;

public class TypePromotion {

    public static void main(String[] args) {

        // short ve byte lar kendi arasinda islem yapilinca java int. cevirdigi icin hata olur

        short num1 = 10;
        short num2 = 20;
        short sum;
        //  short sum = num1+num2; bunu hata olarak görüyor
        int sum2 = num1 + num2;
        System.out.println("sum2 = " + sum2);
        sum = (short) (num1 + num2);
        System.out.println("sum = " + sum);

        byte b1 = 2;
        byte b2;
        // b2=b1*2; bunu kabul etmiyor
        int b3 = b1 * 2;
        System.out.println("b3 = " + b3);
        // ya da
        b2 =(byte)(b1*2);
        System.out.println("b2 = " + b2);


    }
}
