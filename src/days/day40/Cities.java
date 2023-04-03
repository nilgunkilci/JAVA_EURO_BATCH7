package days.day40;

import java.util.ArrayList;

public class Cities {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Amsterdam");
        cities.add("Paris");
        for (int i=0;i < cities.size();i++){
            System.out.println(cities.get(i));
        }
        for (String city : cities) {
            System.out.println(city);
        }
        cities.remove("Moscow");
        System.out.println(cities.toString());

        cities.set(2,"California");
        System.out.println(cities.toString());

        cities.add(2,"NEw Jersey");
        System.out.println(cities.toString());

        int index = cities.indexOf("Istanbul");
        System.out.println("index = " + index);

        System.out.println("-----------------");

        cities.clear();

        System.out.println(cities.size());
        System.out.println(cities.isEmpty());


    }
}
