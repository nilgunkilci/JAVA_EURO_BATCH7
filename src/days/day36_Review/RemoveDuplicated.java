package days.day36_Review;

public class RemoveDuplicated {
    public static void main(String[] args) {
        
        // Verilen String icerisindeki tekrar eden karakterleri kaldiran bir method yaziniz
        // AAACDDDWCEFQ
        
        String oz="AAACDDDWCEFQ";
       String uniqueString= removeDuplicacated(oz);
        System.out.println("uniqueString = " + uniqueString);
    }
    public static String removeDuplicacated (String str){
        String result="";
        for (int i=0; i<str.length()-1;i++){
            // System.out.println( oz.charAt(i));
            if (!result.contains(""+ str.charAt(i))){
                result+=str.charAt(i);
            }

        }
        return result;
        
        
    }
}
