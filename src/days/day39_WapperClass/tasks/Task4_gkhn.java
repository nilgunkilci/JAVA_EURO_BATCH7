package days.day39_WapperClass.tasks;

import java.util.Arrays;

public class Task4_gkhn {
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        // String newStr = "CD015  ACCCG   011899";

        String arr = str.substring(0, 5);

        String[] arr1 = arr.split("");
        Arrays.sort(arr1);

        String arry = str.substring(5, 10);
        String[] arry1 = arry.split("");
        Arrays.sort(arry1);

        String arrys = str.substring(10);
        String[] arrys1 = arrys.split("");
        Arrays.sort(arrys1);




        String s = "";
        for (int i = 0; i < arr1.length; i++) {
            s += arr1[i];

        }
        System.out.println(s);
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                s1 += s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                s1 += s.charAt(i);

            }
        }
        for (int i = 0; i < arry1.length; i++) {
            s1 += arry1[i];
        }

        for (int i = 0; i < arrys1.length; i++) {
            s1 += arrys1[i];
        }
        System.out.println("s1 = " + s1);
    }
}
