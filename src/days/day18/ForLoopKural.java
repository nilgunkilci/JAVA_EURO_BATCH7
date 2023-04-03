package days.day18;

public class ForLoopKural {
    public static void main(String[] args) {

        // baska bir data tip ile loop mümkün mü?
        for (double l = 0.5; l < 0.8; l += 0.1) {
            System.out.println("hello");
        }
        // initialization disarida yapmak mümkün mü?

        int i = 3;  // int deger disarda atama olur
        // boolean condition=i<5; disarda atama olmaz
        for (; i < 5; i++)
            System.out.println("World");


        /// birden fazla condition kullanmak mümkün mü?
        int j = 3;
        for (; j < 5 && j > 2; j++) {
            System.out.println("Hi");

            // inc/dec statement icinde kullanabilir miyim?
            for (int p = 0; p < 5; ) {
                System.out.println("Merhaba");
                p++;
            }

            // Sonsuz dongu
            //for(;;){
            //   System.out.println("Hop");
            //}

            // iki degisken ile initialization
//        for(int t=0, int z =1; z < 5 && t > 3; z++){
//            System.out.println("mmm");
//        }
        }


    }
}



