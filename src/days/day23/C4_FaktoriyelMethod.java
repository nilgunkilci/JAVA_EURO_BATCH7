package days.day23;

public class C4_FaktoriyelMethod {
    public static void main(String[] args) {

        // Bir sayinin faktoriyel degerini dinamik olarak hesap eden bir method yaziniz

        int sayi=5;
        faktoriyel(3);
        faktoriyel(sayi);



    }
    public static void faktoriyel(int num){
        int fak=1;

        for (int i=num; i>=1;i--)
            fak*=i;
        System.out.println(num + "'in faktoriyel : "+ fak);
    }




}
