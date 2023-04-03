package days.day23;

public class C1_PassingArgument {
    public static void main(String[] args) {

        // dogrudan argument gonderme
        displayValue(10);
        System.out.println("**** "  );

        // degiskeni argument olarak gonderme / daha dinamik
        int number;
        number=35;
        displayValue(number);

        // degiskeni aritmatik islem sonucu olarak gönderebiliriz
        displayValue(35*2);

        // error
        // argument olarak sadece beklenen deger gonderilebilir
        // yeni bir degisken olusturma veya deklare etme mumkun degil
        // displayValue(int number);
        // displayValue(int number = 10);

        int sayi = 20;
        displayValue(sayi);




    }

    public static void displayValue(int number){

        System.out.println("Value is  = " + number);
    }
}
