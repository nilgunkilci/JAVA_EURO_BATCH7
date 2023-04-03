package days.day26;

public class C4_DogObject {
    public static void main(String[] args) {
        // ClassName  //ObjectName     // NweKeyword    // ClassName/Constructor
        C1_Dog          dog         =    new              C1_Dog();

        C1_Dog dog1=new C1_Dog();
        C1_Dog dog2=new C1_Dog();


            // " . "  operatorunu kullanarak template class taki field ve methodlara ulasabiliyoruz
        dog.ad ="Artis";
        dog.cins="Dalmacyali";
        dog.renk="SiyahBeyaz";
        dog.yas=6;
        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);
        dog.havla();
        dog.isir();
        dog.yemekYe();
        dog.uyuyor();

        // Object uzerinden ulasilabiklen
        dog.cins="Doberman";
        System.out.println("dog.cins = " + dog.cins);

        // Default degerler
        // String default deger=null
        System.out.println("dog2.ad = " + dog2.ad);

        // int default deger =0
        System.out.println("dog2.yas = " + dog2.yas);

        // boolean default deger= false
        System.out.println("dog2.evcil = " + dog2.evcil);

        // char defaut degeri = //u00000/ nul
        System.out.println("dog2.cins = " + dog2.cins);


    }
}
