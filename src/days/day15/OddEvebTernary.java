package days.day15;

public class OddEvebTernary {
    public static void main(String[] args) {

        // write a ternary statement that checks whether a number is odd or even
        // Bir sayinin tek mi cift mi oldugunu check edeb bir ternary yaziniz.

        int x=24;
         if (x%2==0){
             System.out.println(" x sayisi cift bir sayidir.");
         }else System.out.println("x sayisi tek bir sayidir");

         x=23;
         String message;

         message= (x%2==0)?"even Number":"Odd Number";



        // Lets check first whether number is bigger than 0 or not
        // Sayinin sifirdan buyuk olup olmadigini check edelim
        // nested if else with ternary

         x=-45;

         if (x>0){
             message= (x%2==0)?"even Number":"Oddd Number";

         }else System.out.println("sayi o dan kücüktür.");
    }


}
