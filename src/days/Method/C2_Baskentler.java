package days.Method;

public class C2_Baskentler {
    public static void main(String[] args) {

         String türkiye=baskentler("Türkiye");
        System.out.println(türkiye);
        System.out.println(baskentler("Italya"));

        System.out.println(baskentler2("Almanya"));

    }

    public static String baskentler(String ülke) {
        String baskent = "";

        switch (ülke) {
            case "Türkiye":
                baskent = "Ankara";
                break;
            case "Almanya":
                baskent = "Berlin";
                break;
            case "Ingiltere":
                baskent = "Londra";
                break;
            case "Italya":
                baskent = "Roma";
                break;
            case "Ispanya":
                baskent = "Madrid";
                break;
            case "Norvec":
                baskent = "Oslo";
                break;
            default:
                baskent="tanimsiz";
        }
        // System.out.println("baskent = " + baskent);
        return baskent;


    }
    public static String baskentler2(String ülke) {
        String baskent = "";

        switch (ülke) {
            case "Türkiye":
                return "Ankara";

            case "Almanya":
                return "Berlin";

            case "Ingiltere":
                return  "Londra";

            case "Italya":
                return  "Roma";

            case "Ispanya":
                return  "Madrid";

            case "Norvec":
                return  "Oslo";

            default:
                return "tanimsiz";
        }
        // System.out.println("baskent = " + baskent); return den sonra bu yazim hata verir.
        // cünkü return, break gibi cikis yapar



    }



}
