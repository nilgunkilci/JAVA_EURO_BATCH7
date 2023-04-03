package days.day23;

public class C7_DifferentTypeMultipleArgument {
    public static void main(String[] args) {


        toplama(10,15,"Sayilarin toplami ");
        //toplama(13,"aciklama",23);

    }

    public static void toplama(int num1, int num2, String aciklama){
        int total;
        total = num1 + num2;
        System.out.println(aciklama + total);

        String str = aciklama + "su sekildedir :";

        System.out.println(str);
    }
}
