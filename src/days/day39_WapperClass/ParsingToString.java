package days.day39_WapperClass;

public class ParsingToString {

    public static void main(String[] args) {

        Integer num = Integer.valueOf(30);

        String num2 = String.valueOf(num);

        num2 = num2 + num;
        System.out.println("num2 = " + num2);

        Integer num3 = Integer.valueOf(54);
        String num4 = num3.toString();

        num4 = num4 + num3;
        System.out.println("num4 = " + num4);
    }
}
