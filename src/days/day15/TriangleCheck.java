package days.day15;

public class TriangleCheck {

    public static void main(String[] args) {

        int a, b, c;
        a = 20;
        b = 60;
        c = 100;
        String turu;

        if (a == b && a == c) {
            turu = "Eskenar ucgen";
        } else if (a == b  || a == c  || c==b ) {
            turu = "ikizkenar ucgen";

        } else if (a != b && a != c) {
            turu = "Cesitkenar ucgen";

        } else turu = "belirlenemeyen ucgen turu";
        System.out.println("turu = " + turu);

        turu= (a == b && a == c)?"Eskenar ucgen"
                :(a == b  || a == c  || c==b )?"ikizkenar ucgen"
                :(a != b && a != c)?"Cesitkenar ucgen":
                "belirlenemeyen ucgen turu";
        System.out.println("turu = " + turu);


    }
    }

