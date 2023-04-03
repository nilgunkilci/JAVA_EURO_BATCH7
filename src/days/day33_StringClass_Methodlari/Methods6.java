package days.day33_StringClass_Methodlari;

public class Methods6 {
    public static void main(String[] args) {

        String text= "Merhaba Java Merhaba ";
        System.out.println("text.replace(\"Merhaba\",\"Hello\") = " + text.replace("Merhaba", "Hello"));


        System.out.println("Buyuk harfleri leri _ yapilmis hali = " + text.replaceAll("[A-Z]", "_"));
        System.out.println("kücük harfleri leri * yapilmis hali = " + text.replaceAll("[a-z]", "*"));

        /* String text1 = "Java123ist123am567besten";
        String regex ="d+";
        System.out.println("text1.replaceAll(\"//d+\",\" \") = " + text1.replaceAll(regex, " "));
        */

        System.out.println("text.startsWith(\"Merhaba\") = " + text.startsWith("Merhaba"));
        System.out.println("text.endsWith(\"Merhaba \") = " + text.endsWith("Merhaba "));

        String  kulup = "Adana";
        String kulup2= "ADANA";
        System.out.println("kulup2.equals(kulup) = " + kulup2.equals(kulup));
        //
        System.out.println("kulup2.equalsIgnoreCase(kulup) = " + kulup2.equalsIgnoreCase(kulup));
        //
        System.out.println("kulup2.toLowerCase().equals(kulup.toLowerCase()) = " + kulup2.toLowerCase().equals(kulup.toLowerCase()));
    }
}
