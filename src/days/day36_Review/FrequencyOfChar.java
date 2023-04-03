package days.day36_Review;

public class FrequencyOfChar {
    public static void main(String[] args) {


        // String icerisinde tekrar edilen karakterlerin adedini donduren bir method yaziniz
        // AAACDDDWCEFQ


        String kelime = "AAACDDDWCEFQ";

        String uniqueString= removeDuplicacated(kelime);
        System.out.println("uniqueString = " + uniqueString);
    }
    public static String removeDuplicacated (String str) {
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            // System.out.println( oz.charAt(i));
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }

        }
        String expectedString = "";
        for(int i=0; i<result.length(); i++){
            int counter = 0;
            for(int j=0; j<str.length(); j++){
                if(result.charAt(i)==str.charAt(j)){
                    counter++;
                }
            }
            expectedString += result.charAt(i) + "" + counter;
        }
        return expectedString;



    }




            }

