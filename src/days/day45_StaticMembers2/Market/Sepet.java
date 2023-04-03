package days.day45_StaticMembers2.Market;

import java.util.ArrayList;

public class Sepet {

    ArrayList<Urun> urunler = new ArrayList<>();
    double urunlerToplamFiyat;


    Sepet() { // constructor

        this.urunler = new ArrayList<>();

    }

    public void sepetEkle(Urun urun) {
        this.urunler.add(urun);

    }

    public double sepetToplamFiyat() {
        for (Urun urun : this.urunler) {

            this.urunlerToplamFiyat += urun.getToplamFiyat();
        }
        return urunlerToplamFiyat;
    }

    public String toString() {
        String str = "";
        str += "Sr      Urunun adi        Birim F.          Miktari       Toplam F.       Katagori\n";
        str += "---     ----------        --------          -------       ---------       -----------\n";
        int srNo = 1;
        for (Urun urun : urunler) {
            str += srNo++ + "-\t" + urun + "\n";
        }
        str += "\n        Urunlerin toplam fiyati= " + sepetToplamFiyat();
        return str;

    }
}
