package days.day15;

public class MultipleConditionTernary {
    public static void main(String[] args) {

        String ogrenci = "Fatih";
        int diplomaNotu = 55;
        int sinavSonucu = 90;
        String kayitSonucu;

        kayitSonucu = diplomaNotu > 60 && sinavSonucu > 85 ? "kaydi kabul edilmisitir" : "kaydi reddedilmistir";

        System.out.println(ogrenci + "'in " + kayitSonucu);
    }


}



