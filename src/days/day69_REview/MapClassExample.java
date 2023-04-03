package days.day69_REview;

import java.util.HashMap;
import java.util.Map;

public class MapClassExample {

    public static void main(String[] args) {

        Map<Integer,PersonKisi> persons = new HashMap<>();
        PersonKisi personKisi = new PersonKisi(12345,"Ahmet Falanca","Istanbul/Türkiye");

        persons.put(personKisi.gettCNo(),personKisi);
        personKisi= new PersonKisi(56789, "John Smith", "Colorada/USA");
        persons.put(personKisi.gettCNo(),personKisi);
        System.out.println(persons);
    }
}
