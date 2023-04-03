package days.day5;

public class Text {
    public static void main(String[] args) {
        // primitive date type lari kücük harfle yaziyoruz
        int no = 100;
        String sehir ="Istanbul";
        // jvm
        // stack     ve      heap
        // sehir  -------->   Istanbul
        String bugün = "Pazartesi";
        System.out.println("bugün = " + bugün);
        bugün ="Sali";
        System.out.println("bugün = " + bugün);
        bugün ="100000";
        int numara = 100000;
        System.out.println(sehir + bugün + " günü cok güzel");
        System.out.println(2 + 2);
        String str = "100";
        String str2 =  "200";
        System.out.println(100 + 200);
        System.out.println("100"+"200");
        System.out.println(str2  + str2);
        System.out.println("100" + 200);
        System.out.println("A"+"b"+"c");


    }
}
