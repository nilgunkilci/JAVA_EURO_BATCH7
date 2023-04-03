package days.day9;

public class Unary22 {
    public static void main(String[] args) {
        int numara = 20;
        ++numara;// numara degiskeninin degerini 1 artiriyor 21
        System.out.println("numara = " + numara);//21
        numara++;//degeri 1 artirilmis  22
        System.out.println("numara = " + numara);// 22
        int b = numara;
        System.out.println("b = " + b);
        b = ++numara;
        System.out.println("b = " + b);
        b = numara++;// 23
        System.out.println("b = " + b);
        System.out.println("numara = " + numara);

        numara = 25;
        numara--;//25 -1=24
        System.out.println("numara = " + numara);
        --numara;
        System.out.println("numara = " + numara);//23
        b = numara;// b ye 23 degerini atamis oldum
        b = --numara;//
        System.out.println("b = " + b);
        System.out.println("numara = " + numara);
        b = numara--;// numara (--) isleminden once  22 , b=22  atama sonrasi numara nindegerini 1 eksiltiyorum
//      b =  22
        System.out.println("b = " + b);
        System.out.println("numara = " + numara);
}}
