package days.day54.Bilgisayar;

import days.day31_StringClass.SonKarakter;

public class Anakart {

    private String model;
    private String ureticiFirmaa;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Anakart(String model, String ureticiFirmaa, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.ureticiFirmaa = ureticiFirmaa;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }public void programYukle(String programAdi){
        System.out.println(programAdi +" ali program yuklendi");
    }
    public String getModel(){
        return model;
    }public String getUreticiFirmaa(){
        return ureticiFirmaa;
    }public int getRamSlot(){
        return ramSlot;
    }public int getCardSlot(){
        return cardSlot;
    }public String getBios(){
        return bios;
    }

    @Override
    public String toString() {
        return "Anakart{" +
                "model='" + model + '\'' +
                ", ureticiFirmaa='" + ureticiFirmaa + '\'' +
                ", ramSlot=" + ramSlot +
                ", cardSlot=" + cardSlot +
                ", bios='" + bios + '\'' +
                '}';
    }
}
