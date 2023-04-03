package days.day11;

public class IfElseStatementExercises {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("User is eligible to Vote");
        } else {
            System.out.println("User is not eligible to Vote");
        }

        //__________________________________________________________

        int radius = 3;
        double area;
        double pi = 3.14;
        if (radius > 0) {

            area = radius * radius * pi;
            System.out.println("area = " + area);
        } else {
            System.out.println(" This is not circle");
        }

        int i = 7;

        if (i%2==0){
            System.out.println( i + " sayisi cift bir sayidir "  );

        }else{
            System.out.println(i + " sayisi tek sayidir " );
        }

        double pay=100;
        int score=90;

        if (score>=90){
            pay += pay+pay*3/100;
        }else{
            pay += pay+pay*1/100;
        }
        System.out.println("pay = " + pay);

        }
    }
