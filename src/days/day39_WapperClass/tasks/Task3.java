package days.day39_WapperClass.tasks;

public class Task3 {

    // Write a method that can recognise numbers in following Strings and print them as digits
    //String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$”;
    //String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";

    public static void main(String[] args) {
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        System.out.println("Character.valueOf(str1.charAt(0)) = " + Character.valueOf(str1.charAt(0)));
       // System.out.println("sayi(str1) = " + sayi(str1));
        sayilariFiltrele(str1);
        sayilariFiltrele(str2);
    }
    public static void sayilariFiltrele(String str){


        String sayi="";
        for (int i= 0; i<str.length();i++){
           if (Character.isDigit( str.charAt(i))==true){
            sayi+=str.charAt(i)+" ";

           }
        }
        System.out.println("sayi = " + sayi);


    }
}
