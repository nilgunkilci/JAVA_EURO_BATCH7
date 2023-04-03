package days.day41_Constructor;

import java.util.ArrayList;

public class  Banka {

    String adi;
    String adresi;
    int hesapNo = 1000;
    ArrayList<Musteri> musteriler = new ArrayList<>();

    public Banka(String adi, String adresi) {
        this.adi = adi;
        this.adresi = adresi;
    }

    public void musteriEkle(Musteri musteri){

        this.hesapNo++;
        musteri.hesapNo = this.hesapNo;
        this.musteriler.add(musteri);
        System.out.println(musteri.hesapNo + " hesap nolu " + musteri.adi + " isimli müşteri bankaya eklendi.");
    }
    public void paraCek(Musteri musteri,double paraMiktari){
        if(musteri.bakiye >= paraMiktari){
            // musteri.bakiye = musteri.bakiye - paraMiktari;
            musteri.bakiye -= paraMiktari;
            musteri.showInfo();
        }else {
            System.out.println("Bakiyeniz " + paraMiktari + " TL para çekmeye müsait değil!");
            System.out.println("Enfazla " + musteri.bakiye + " TL kadar para çekebilirsin.");
        }
    }


    public void showInfo(){
        System.out.println(" Bankamizdaki musterilerin bilgileri asagidadir.");
        System.out.println("------------------------------");
        
    }
}
