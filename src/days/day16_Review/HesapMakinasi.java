package days.day16_Review;

public class HesapMakinasi {
    public static void main(String[] args) {

        //
        int num1 = 5;
        int num2 = 10;
        int sonuc = 0;
        String islemTuru;
        char islem = '+';
        switch (islem) {
            case '+':
                islemTuru="Toplama Islemi";
                sonuc=num1+num2;
                break;
            case '-':
                islemTuru="Cikarma Islemi";
                sonuc=num1-num2;
                break;
            case '*':
                islemTuru="Carpma Islemi";
                sonuc=num1*num2;
                break;
            case '/':
                islemTuru="Bölme Islemi";
                sonuc=num1/num2;
                break;
            default:
                islemTuru="Tanimlanamayan Islem";


        }
        System.out.println("islemTuru = " + islemTuru);
        System.out.println("sonuc = " + sonuc);


    }
}
