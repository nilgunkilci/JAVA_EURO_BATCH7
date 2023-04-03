package days.day39_WapperClass;

public class ParsingFromString {

    public static void main(String[] args) {

        String stringNumber= "2022";
        int number= Integer.valueOf(stringNumber);

        int number2= Integer.parseInt(stringNumber);
        System.out.println("num = " + number);
        System.out.println("num2 = " + number2);

        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);

        stringNumber = stringNumber + 5;
        System.out.println("stringNumber = " + stringNumber);

        number = number + 5;
        System.out.println("number = " + number);

        number = number + number2;
        System.out.println("number = " + number);

        Double number3 = Double.parseDouble(stringNumber);
        System.out.println("number3 = " + number3);

        String str = "2022A";
        int number4 = Integer.parseInt(str);
        //System.out.println("number4 = " + number4);
        // Error / NumberFormatException

    }
}
