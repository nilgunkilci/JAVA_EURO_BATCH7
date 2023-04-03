package days.day15;

public class NestedTerneary {
    public static void main(String[] args) {

        String cinsiyet="Bay";
        int yas=70;
        String sonuc;

        sonuc=(cinsiyet=="Bayan")?((yas>60)?"emekli olabilirsiniz":"emekli olamazsiniz")
                :((yas>65)?"emekli olabilirsiniz":"emekli olamazsiniz");
        System.out.println("sonuc = " + sonuc);
    }
}
