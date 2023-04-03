package days.day26;

public class C6_CakeTest {
    public static void main(String[] args) {

        C5_Cake cake1=new C5_Cake();
        cake1.isChoclate=true;
        cake1.slices=10;
        cake1.bakery="Ayse";

        C5_Cake cake2=new C5_Cake();
        cake2.isChoclate=false;
        cake2.slices=10;
        cake2.bakery="Murat";

        cake1.eat();
        cake1.eat();
        cake2.eat();

    }
}
