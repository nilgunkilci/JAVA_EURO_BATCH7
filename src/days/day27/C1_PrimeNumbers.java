package days.day27;

public class C1_PrimeNumbers {

    // Bir sayinin asal olup olmadigini kontrol edin.
    // belirli bir araliktaki sayilardaki asal sayilari yazdirin

    public static void main(String[] args) {

        /* boolean asalSayiMi = true;
        for (int i=2;i<100;++i){    // Birinci for sadece kontrol araligini belirliyor.
            for (int n=2;n<i;++n){
                if(i%n==0){
                    asalSayiMi=false;
                }
            }if (asalSayiMi){
                System.out.println(i + " asal sayidir");
            }
            asalSayiMi=true;

        } */

        asalSayilariYazdir(20,30);
        asalSayilariYazdir(17,45);


    }
    static void asalSayilariYazdir(int baslangic ,int son){

        System.out.println(baslangic + " ile " + son +" arasindaki asal sayilari yazdiriyoruz.");
        boolean asalSayiMi = true;
        for (int i=baslangic;i<son;++i){    // Birinci for sadece kontrol araligini belirliyor.
            for (int n=2;n<i;++n){
                if(i%n==0){
                    asalSayiMi=false;
                }
            }if (asalSayiMi){
                System.out.println(i + " asal sayidir");
            }
            asalSayiMi=true;

        }

    }
}
