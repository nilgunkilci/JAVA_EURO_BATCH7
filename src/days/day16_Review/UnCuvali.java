package days.day16_Review;

public class UnCuvali {
    public static void main(String[] args) {

        int xcuval = 12;
        int ycuvali = 3;
        int istenilen = 27;
        boolean result = ((ycuvali * 5) + (istenilen - (ycuvali * 5)) == istenilen) && (istenilen - (ycuvali * 5)) == xcuval;
        System.out.println("birinci talep " + result);

        // Elimizde belili sayida 5 kiloluk ve 1 kiloluk un paketleri var
        // Musteriye istedigi kiloda unu verip veremeyecegimizi tespit eden bir program yaziniz

        int beslikPaket = 3;
        int birlikPaket = 11;
        int talep = 27;
        boolean cevap = false;

        if (beslikPaket * 5 >= talep) {
            if (birlikPaket >= talep % 5) {
                cevap = true;
            }
        } else if (birlikPaket >= talep - beslikPaket * 5) {
            cevap = true;
        }


        System.out.println("ikinci talep = " + cevap);
    }


}
