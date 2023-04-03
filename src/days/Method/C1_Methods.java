package days.Method;

public class C1_Methods {
    public static void main(String[] args) {

        System.out.println(kucukSayi(1, 11));

        if (kucukSayi(5,20)%2==0){
            System.out.println(" sayi cift sayidir");
        }




    }

    public static int kucukSayi (int a,int b){
    int min =0;
    if (a<b){
        min=a;
    }else {
        min=b;
    }
    return min;

    }
}
