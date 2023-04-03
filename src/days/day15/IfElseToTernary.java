package days.day15;

public class IfElseToTernary {
    public static void main(String[] args) {

        int num = 15;
        // If Else
        if(num > 0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }

        // Ternary
        String result = (num > 0 ) ? "Positive Number" : "Negative Number";
        System.out.println("result = " + result);

        // 2. yontem cok kullanilmiyor
        System.out.println((num < 0) ? "Positive Number" : "Negative Number");
    }
}
