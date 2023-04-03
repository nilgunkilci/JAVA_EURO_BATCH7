package days.day54.Bilgisayar;

public class Boyut {
    private double yukseklik;
    private double genislik;
    private double derinlik;

    public Boyut(double yukseklik,double genislik,double derinlik){
        this.yukseklik=yukseklik;
        this.genislik=genislik;
        this.derinlik=derinlik;


    }public double getYukseklik(){
        return getYukseklik();
    }

    public double getDerinlik() {
        return derinlik;
    }

    public double getGenislik() {
        return genislik;
    }

    @Override
    public String toString() {
        return "Boyut{" +
                "yukseklik=" + yukseklik +
                ", genislik=" + genislik +
                ", derinlik=" + derinlik +
                '}';
    }
}
