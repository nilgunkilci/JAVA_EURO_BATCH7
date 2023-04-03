package days.day7;

public class DataLoss {

    public static void main(String[] args) {

        byte b;
        int i = 257; // bu sayinin sirri byte sinir araligi
        double d = 323.48;
        b = (byte) i;
        // byte range is between -128... 127 and starts counting from scratch
        // 128 yazarsak range bittigi icin en alt range yani -128 den saymaya basliyor
        // b % 256 = 1 // Data loss

        System.out.println("int deger i= " + i + " , byte deger b= " + b);

        b = (byte) d;
        // b % 256 = 67 // Data Loss - range + kusurat
        System.out.println("double deger d = " + d+ "byte deger = "+b);


    }
}
