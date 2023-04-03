package days.day54.Bilgisayar;

public class BilgisayarTest {
    public static void main(String[] args) {

        Boyut boyut= new Boyut(35.5,15.3,20.8);
        Kasa kasa=new Kasa("Nirvana","Dell","Elektrik",boyut);
        Monitor monitor= new Monitor("5500","LG",23,new Cozunurluk(1920,1800));
        Anakart anakart= new Anakart("S345","Intel",4,2,"v1.2");

        Bilgisayar bilgisayar= new Bilgisayar(anakart,monitor,kasa);

        System.out.println(bilgisayar.getMonitor().getEkranBoyutu());
        bilgisayar.getKasa().calistir();
        bilgisayar.getAnakart().programYukle("Word");
        System.out.println(bilgisayar.toString());
    }
}
