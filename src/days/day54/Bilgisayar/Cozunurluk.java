package days.day54.Bilgisayar;

public class Cozunurluk {
    private int boy;
    private int en;

    public Cozunurluk(int boy, int en) {
        this.boy = boy;
        this.en = en;
    }
    public int getBoy(){
        return boy;

    }public int getEn(){
        return en;
    }

    @Override
    public String toString() {
        return "Cozunurluk{" +
                "boy=" + boy +
                ", en=" + en +
                '}';
    }
}
