package days.day42_Constructor2.otoPark;

import java.util.ArrayList;

public class Otopark {
    String name;
    String  adress;

    ArrayList<Car> arabalar = new ArrayList<>();
    public Otopark(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void arabaEkle(Car araba){
        System.out.println(araba.marka+" marka"+ araba.plaka +" plakali arac otoparka giris yapti");
        this.arabalar.add(araba);
        System.out.println("otoparkta su anda = " + arabalar.size() + " adet araba var");
    }

    public  void arabaListesi (){
        System.out.println(this.name +" park etmis arabalar listesi");
        System.out.println("________________________________");
        for (Car araba : this.arabalar) {
            System.out.println(araba);

        }
    }
    @Override
    public String toString() {
        return "Otopark{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
