package days.day45_StaticMembers2.Market;

public class Urun {

    String urunAdi;
    double birimFiyati;
    double miktar;
    String kategori;
    double toplamFiyat;

    public Urun(String urunAdi, double birimFiyati, double miktar, String kategori) {
        this.urunAdi = urunAdi;
        this.birimFiyati = birimFiyati;
        this.miktar = miktar;
        this.kategori = kategori;
    }

    public double getToplamFiyat() {
        this.toplamFiyat = birimFiyati * miktar;
        return toplamFiyat;

    }
    public String toString (){
        String str= "";
        str += "\t"+urunAdi+" \t\t\t" + birimFiyati + "\t\t\t " + miktar +"\t\t\t " +getToplamFiyat()+"\t\t"+ kategori ;
        return str;
    }

    public static void main(String[] args) {

        Urun urun1=new Urun("Elma", 15,3,"yiyecek");
        System.out.println("urun1 = " + urun1);
    }
}
