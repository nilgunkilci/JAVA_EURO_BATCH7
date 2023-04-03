package days.day45_StaticMembers2;

public class MainClass {


    static int sayi =5;
    int number=0;

    // onunde static key word olan blocklara static block denir
    static {
        // Static code block
        System.out.println(" Executing  static block.2");
        System.out.println("sayi = " + sayi);
    }

    // onunde hicbir key word olmayan blocklara non-static block denir
    {
        // Non-Static block _ instance- Objeckt block
        System.out.println(" Executing non-static block");
        number = 500;
        for (int i = 0; i < 5; i++) {
            System.out.println(" hallo ich bin im non-static block");


        }
        System.out.println(" Number in non- static = " + number);
    }
    MainClass(){ // constructor block
        System.out.println(" Exucuting constructor block");
        this.number = 35;
        System.out.println(" Number in constructor = " + number);

    }

    public static void main(String[] args) {

        System.out.println("Executing main method");

        MainClass main1 = new MainClass();
        main1.number=34;
        System.out.println("MainClass.sayi = " + MainClass.sayi); // sayi variable , static belirlendigi icin direk class ismi ile cagrilir.
        // MainClass.number;                                      // number variable, static belirlenmedigi icin , direk cagrilamaz. obje olusturulmali
    }
    static {
        // Static code block
        System.out.println(" Executing  static block1.");

    }
}
