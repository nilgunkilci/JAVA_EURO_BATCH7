package days.day52.constructor;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int okulNo;

    protected Ogrenci(){

    }

    public Ogrenci(String ad, String soyad, int okulNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.okulNo = okulNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }
}
