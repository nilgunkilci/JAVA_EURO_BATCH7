package days.day35_Arrays;

public class TekrarEdenKarakterler {
    public static void main(String[] args) {

        String str = "erdem";
        String yeni= ""; // absc

        for (int i=0; i<str.length(); i++){
           //  System.out.println("str.charAt(i) = " + str.charAt(i));
           // if (!yeni.contains("" + str.charAt(i))){
            if (!yeni.contains(String.valueOf(str.charAt(i)))){

                yeni+=str.charAt(i);

            }
        }
        System.out.println("yeni = " + yeni);
    }
}
