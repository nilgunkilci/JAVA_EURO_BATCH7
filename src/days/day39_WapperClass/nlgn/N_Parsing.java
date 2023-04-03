package days.day39_WapperClass.nlgn;

public class N_Parsing {

    public static void main(String[] args) {

        // PARSING VALUES FROM A STRING ( String icerisindeki sayisal karakterler)
        //  STRING -------> PRIMITIVE YA DA WRAPPER OBJECT
        // ValueOf ya da parseInt, parseDouble ... ile yapilir

        String str1 = "1234";
        Integer sayi1= Integer.valueOf(str1);
        int sayi11=sayi1;

        Integer num = 123;
        num=sayi11;

        System.out.println("sayi = " + sayi1);
        System.out.println("str = " + str1);
        System.out.println("sayi11 = " + sayi11);


        String str2 = "34.567";
        Double sayi2 = Double.parseDouble(str1);
        double sayi22= sayi2;
        System.out.println("sayi2 = " + sayi2);
        System.out.println("str1 = " + str1);
        System.out.println("sayi22 = " + sayi22);





        // PARSING VALUES TO STRING
        // WRAPPER OBJECT TEN-------> STRING E
        // String.valueOf(..) ya da toString methodu ile

        Integer num34 = new Integer(999);
        String num1= num.toString();           // toString ile
        String num2 = String.valueOf(num);      // Strring.valueOf(..) ile
        System.out.println("num2 = " + num2);


    }
}
