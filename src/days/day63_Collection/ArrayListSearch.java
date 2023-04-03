package days.day63_Collection;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Ankara ");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Adana");
        cities.add("Konya ");

        System.out.println(cities);
        System.out.println(cities.contains("Kayseri"));
        System.out.println(cities.contains("Sivas"));
        if (cities.contains("Adana")){
            System.out.println("Aradiginiz sekir listede var");
            System.out.println(" index of \"Adana\"  = " + cities.indexOf("Adana"));
        }else System.out.println("Aradiginiz sehir listede yok");
    }
}
