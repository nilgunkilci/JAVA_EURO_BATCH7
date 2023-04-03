package days.day68_Review;

public class Palindrom {
    public static void main(String[] args) {

        String str = "kayak";
        System.out.println("polindrome(str) = " + polindrome(str));
        System.out.println(polindrome("Kayak"));
        System.out.println(polindrome("123454321"));
        System.out.println(polindrome("Ey edip adanada pide ye"));
    }
    public static boolean polindrome(String str){
        boolean flag = true;
        for (int i = 0; i<str.length()/2; i++){
            int j = str.length()-1;
            if(str.charAt(i)!=str.charAt(j)) {

            }
            j--;
        }
        return flag;
    }
}
