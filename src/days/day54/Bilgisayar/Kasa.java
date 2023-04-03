package days.day54.Bilgisayar;

public class Kasa {
    private String model;
    private String ureticiFirma;
    private String gucKaynagi;
    private Boyut boyut;  // Boyut classindan bir obje yi buraya data member yapiyoruz. boylece has a relation olusur.

    public Kasa ( String model,String ureticiFirma,String gucKaynagi,Boyut boyut){
        this.model= model;
        this.ureticiFirma=ureticiFirma;
        this.gucKaynagi=gucKaynagi;
        this.boyut=boyut;

    }
    public void calistir(){
        System.out.println("Bilgisayar baslatildi");
    }

    public String getUreticiFirma(){
        return ureticiFirma;
    }public String getModel(){
        return model;
    }public  String getGucKaynagi(){
        return gucKaynagi;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", gucKaynagi='" + gucKaynagi + '\'' +
                ", boyut=" + boyut +
                '}';
    }
}
