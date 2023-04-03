package days.day39_WapperClass.tasks;

import java.util.Arrays;

import static java.lang.Character.*;

public class dnm {
    public static void main(String[] args) {
         String str =  "DC501GCCCA098911";

         String strNew= "";
        System.out.println("sortLetterAndNumbers(str) = " + sortLetterAndNumbers(str));


    }
    public static String sortLetterAndNumbers(String input){
        String sInput= "";
        for (int i = 0; i < input.length(); i++) {
            sInput+= ""+input.charAt(i);
            if (i<input.length()-1) {
                if ( (isAlphabetic(input.charAt(i)) &&  isDigit(input.charAt(i + 1))) ||  (isDigit(input.charAt(i)) &&  isAlphabetic(input.charAt(i + 1)))) {
                    sInput += "-";


                }
            }
        }
        System.out.println("sInput = " + sInput);
        String [] sInputArray = sInput.split("-");
        System.out.println("Arrays.toString(sInputArray) = " + Arrays.toString(sInputArray));
        String returnStr= "";
        for (String eachString : sInputArray){
            String[]split = eachString.split("");
            Arrays.stream(split);
            for (String str :split){
                returnStr +=str;
            }
        }
        return returnStr;


    }
}
