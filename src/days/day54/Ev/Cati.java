package days.day54.Ev;

public class Cati {
    private int  yukseklik;
    private String renk;

    public Cati(int yukseklik, String renk) {
        this.yukseklik = yukseklik;
        this.renk = renk;
    }
    public void tut(){
        System.out.println("baca tutuyor");
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public String getRenk() {
        return renk;
    }
}
