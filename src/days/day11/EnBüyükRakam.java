package days.day11;

public class EnBüyükRakam {
    public static void main(String[] args) {

        int num1=3;
        int num2=12;
        int num3=12;
        int num;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("maxNum = " + num1);
        }
        if (num2 >= num1 && num2 >= num3) {
            System.out.println("maxNum = " + num2);
        }
        if (num3 >= num2 && num3 >= num1) {
            System.out.println("maxNum = " + num3);
        }
        }
    }
