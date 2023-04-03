package days.day63_Collection;

import java.util.ArrayList;

public class ArrayListAddd {

    public static void main(String[] args) {
        ArrayList<String>  cities = new ArrayList<>();

        cities.add("Ankara ");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Adana ");
        cities.add("Konya ");
        System.out.println("cities = " + cities);

        ArrayList< String> cities1 = new ArrayList<>();
        cities1.add("Corum");
        cities1.add("Yozgat");
        cities1.add("Diyarbakir");
        cities1.add("Adiyaman");
        ArrayList<String> citiesToplam = new ArrayList<>();
       // for (String city: cities){
         //   citiesToplam.add(city);
       // }for (String city : cities1){
         //   citiesToplam.add(city);
        //}

        citiesToplam.addAll(cities);
        System.out.println("citiesToplam = " + citiesToplam);
        citiesToplam.addAll(cities1);
        System.out.println("citiesToplam = " + citiesToplam);




    }
}
