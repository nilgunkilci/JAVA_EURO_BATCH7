package days.day18;

public class ForLoop2 {

    public static void main(String[] args) {

        // Dongu degiskenini statementta kullanmak
        // ve dongu sayisini statementta bastirma
        for(int i=1; i<=5; i++){
            System.out.println("kacinci dongu : " + i);
            System.out.println("Hello World");
        }

        System.out.println("---------");

        // Donguye baslangic noktasi degisken olabilir
        for(int i=50; i<=60;i++){
            System.out.println(i);
        }

        System.out.println("---------");

        // inc/dec i kontrol
        for(int i=0; i < 10; i+=3){
            System.out.println(i);
        }

        System.out.println("---------");


        // döngüyü ters kurgulamak
        for (int i=10;i>0;i--){
            System.out.println(i);
        }
    }
}
