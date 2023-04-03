package days.day39_WapperClass.tasks;

public class Task5 {
    public static void main(String[] args) {
        /*
        Write a method that can return the sum of the digits in a string
        Ex: sumOfDigits(String s)
         */

        String dizi="al8kh4dr6";
        System.out.println("String icindeki sayilar toplami = " + sumOfDigits(dizi));
    }
    public static int sumOfDigits(String s){

        int sum=0;
        for (int i= 0; i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){
                sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return sum;
    }
}
