package days.day23;

public class C3_TypeCompatibility {
    public static void main(String[] args) {

        displayNumber(10);
        // long deger methodun bekledigi data tipinden buyuk oldugu icin explicit casting bekliyor
       //   displayNumber(10000000000);
       //   displayNumber(10.0);
        // daha kucuk data tipini ototmatik olarak cast ettigi icin
        // methodda data tipi uyumsuzlugu hatasi almadik
        byte num=5;
        displayNumber(num);

        // explicitly casting ile buyuk data tipine sahip degiskeni
        // methoda gonderebildik
        double num2=15.3;
        displayNumber((int)num2);
        displayNumber((int)15.2);
        displayNumber((int)10000000000l);



    }
    public static void displayNumber(int number){
        System.out.println("Number is : " + number);
    }
}
