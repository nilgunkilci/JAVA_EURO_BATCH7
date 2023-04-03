package days.day39_WapperClass;

public class FilterString {

   // "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$ %a>>>$s@777.||}{";

    public static void main(String[] args) {
        kelime("(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{");

    }
    public static void kelime(String str){
        String kelime=" ";
        for (int i=0; i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' '){
                kelime+=str.charAt(i);
            }
        }
        System.out.println("kelime = " + kelime);
    }
}
