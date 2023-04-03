package days.day66_Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LoopingMap {
    public static void main(String[] args) {

        Map<String, String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("France", "Paris");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("Türkiye", "Ankara");

        // get list of keys
        System.out.println(capitalCities.keySet());

        // get list of values
        System.out.println("capitalCities.values() = " + capitalCities.values());

        System.out.println(" Printing keys .......");

        for (String country : capitalCities.keySet()){
            System.out.print(country + " | ");
        }

        System.out.println();
        System.out.println(" Printing values .......");

        for (String country : capitalCities.values()){
            System.out.print(country + " | ");
        }
        System.out.println();

        Set<String> countries = capitalCities.keySet();
        for (String country : countries){
            System.out.print(country + " | ");
        }

        System.out.println();

        Collection<String> cities = capitalCities.values();
        for(String city : cities){
            System.out.print(city + " | ");
        }






        System.out.println();

        // How to print keys and values in same iteration
         for (String country : capitalCities.keySet()){
             System.out.println(country + " | " + capitalCities.get(country));
         }
        System.out.println();

        // 2. way
        for(Map.Entry<String,String> capitals : capitalCities.entrySet()){
            System.out.println(capitals.getKey() + " | " + capitals.getValue());
        }


    }
}
