package days.GrupArbeit;

public class Task2 {
    /*Write a program that can retrieve the letters, digits and special characters from the string
    Ex:
    str = "Wooden Spoon!"

    output:
    letters= "WoodenSpoon";
    Digits = "";
    specialChars = " !";

     */
    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        filtrele(str);
    }
    public static void filtrele(String str){
        String letters="";
        String digits="";
        String specialChars="";

        for (int i=0; i<str.length();i++){

            if (Character.isDigit(str.charAt(i))){
                digits=digits+str.charAt(i)+"";
            } else if (Character.isLetter(str.charAt(i))) {
                letters=letters+str.charAt(i)+"";
            }else specialChars=specialChars+str.charAt(i);

        }
        System.out.println("letters= "+"\""+letters+"\"");
        System.out.println("digits= "+"\""+digits+"\"");
        System.out.println("specialChars= "+"\""+specialChars+"\"");
    }
}
