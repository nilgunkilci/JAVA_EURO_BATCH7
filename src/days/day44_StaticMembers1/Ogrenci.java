package days.day44_StaticMembers1;

public class Ogrenci {
    String adi;
    int ogrNo;
    static  int okulNo= 1000;
    final  static String okulAdi= "EuroTech Study";
    final static String okulAdresi= "Germany";


    public Ogrenci(String adi  ) {
        okulNo++;
        this.adi = adi;
        this.ogrNo = okulNo;
        // this.okulAdi = okulAdi;
        // this.okulAdresi = okulAdresi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", ogrenciNo=" + ogrNo +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}
