package days.day17;

public class WhileLoops {
    public static void main(String[]args){

        int a=0;
        while ((a < 3)) {

            System.out.println("Hello");
            a++;
        }
        // tüm döngülerin ortak bir noktasi var
        // 1- degerini artirabilecegimizh bir degisken olacak, genelde int deger olmali
        // ve bu degiskene bir baslangic degeri atanmali.
        // 2- condition olmali (true ya da false degeri vermeli bu sart)
        // true ise block exuqied edilir
        // döngüye bir sinir limit konulmali.

        // loop dan sonra a yi yazdirirsak degeri son deger olarak döner.
        System.out.println("a = " + a);

        a=0;
        while (a<3){
            System.out.print(a);
            a++;
        }
        System.out.println("\n");
        System.out.println("_________________________");
        a=0;
        while (a<3){
            a++;
            System.out.print(a+" ");
            System.out.println(a);
        }


    }
}
