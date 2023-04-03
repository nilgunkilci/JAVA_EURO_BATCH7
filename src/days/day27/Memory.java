package days.day27;

public class Memory {

    public static void main(String[] args) {

        String  sehir = "Istanbul";
        String sehir2= "Istanbul";
        System.out.println(sehir == sehir2); // true doner

        // object olusturarak atama yapalim
        String sehir3= new String( "Istanbul");
        System.out.println("sehir3 = " + sehir3);

        // icerik ayni olsa da obkect olusturarak atama yaptigimizda karsilastirma false doner.
        // cunku hafizada object baska yerde olusturulmustur.
        System.out.println("sehir, sehir3 e esit mi = "+(sehir == sehir3));  // false



        int a= 10;
        int b= 10;
        byte b1=5;

        System.out.println("a, b ye esit mi = "+(a == b));  // true döner . cunku  hafizada ayni yerde bulunuyorlar.
        // Primitive data types Stack memory de tutulur. int, byte, short, long, double, float, boolean, char

        print(); // method cagrildigin da compiler in sirasiyla exuced eder
        //  Lifo ----> last in first out


        // objectler nerede olusur??????


        Memory hafiza=new Memory();  // hafiza ismi bize object in nerede olustugunu gösteren bir degisken. ve bu degisken Stack de olusur
                                    // object nin kendisi Heap memoryde
        hafiza.a=250;
        System.out.println("hafiza.a = " + hafiza.a);
        System.out.println("hafiza.gb = " + hafiza.gb);  // gb instence variable oldugu icin ,
                                                            // yazdirmak icin hafiza object ini kullaniyoruz

        Memory hafiza2=new Memory();
        hafiza2.gb=30;
        System.out.println("hafiza2.gb = " + hafiza2.gb);  // ayni intence degeri farkli object ile cagirabiliriz

        Memory hafiza5; // bu sadece referans olusturuluyor ve bu stack de olusur
        hafiza5=hafiza;  // hafiza5 e , hafizayi atadik. yani herikisi de Heap memory de ayni object i referans ediyor.
        System.out.println("hafiza5.a = " + hafiza5.a);

        // hafiza5 e yeni deger atayinca hafiza nin da degeri degisir.
        hafiza5.gb= 40;
        System.out.println("hafiza5.gb = " + hafiza5.gb);
        System.out.println("hafiza.gb = " + hafiza.gb);

        // hafiza5 e yeni bir object olusturabiliriz. bu sekilde hafiza ile esit olmaz
        // olusmus referansa yeni object olusturmak icin new Keywordu, class ismi olmadan kullaniyoruz

        hafiza5=new Memory();
        System.out.println("hafiza5.gb = " + hafiza5.gb); // sonuc 0 olur . cunku sadece yeni object olusturduk ama atama yapmadik.
                                                            // atama yapilmayan int objectlerde deger 0 döner

        // instence variableler Heap memory de tutulur
        // ve hem clas icinde hem de main method icerisinde deger atanabilir.
        System.out.println("hafiza.a = " + hafiza.a);
        System.out.println("hafiza2.a = " + hafiza2.a);
        System.out.println("hafiza5.a = " + hafiza5.a);
        // ?????  System.out.println("hafiza2.a==hafiza.a = " +( hafiza2.a == hafiza.a));


    }
    int gb;  // bu bir instence variable. cunku class icerisinde olusturduk. main method icinde olusturmadik
    int a=100;

    public static void print (){
        int a= 10;
        print2();
        System.out.println("a = " + a);
    }
    static void print2(){
        int b= 10;
        System.out.println("b = " + b);
    }

}
