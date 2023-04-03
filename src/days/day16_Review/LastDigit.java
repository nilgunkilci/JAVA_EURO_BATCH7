package days.day16_Review;

public class LastDigit {
    public static void main(String[] args) {
        // Write a program that checks last digits of two numbers
        // Iki sayinin son rakamlarini karsilastiran bir program yaziniz

        int num1,num2;
        num1=267;
        num2=87;
        String result;

        if (num1%10==num2%10){
            result="son rakamlar esittir";

        }else result="son rakamlar esit degildir";
        System.out.println("result = " + result);

        // 2. yol

        boolean b;
        b=num1%10==num2%10;
        System.out.println("b = " + b);

        // 3. yol

        System.out.println("b = " + (num1%10==num2%10));
    }
}
