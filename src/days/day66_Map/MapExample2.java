package days.day66_Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {

        Map<String, Double> items = new HashMap<String,Double>();
        items.put("Apple", 5.3);
        items.put("Orange", 6.5);
        items.put("Banana", 8.5);
        items.put("Cherry", 9.0);

        System.out.println("items = " + items);
        System.out.println("items.isEmpty() = " + items.isEmpty());

        items.put("Apple",7.4); // 2. bir Apple olusturmuyor. sadece Apple in degerini degistirmis oluyor
        System.out.println("items = " + items);

        items.remove("Apple");   // Listeden kaldiriyor.
        System.out.println("items.size() = " + items.size());
        System.out.println("items = " + items);

        System.out.println(items.putIfAbsent("Banana", 7.9));  // putIfAbsent eger yoksa ekle demek. varsa eski degeri döndürür. varsa yeni degeri ekler.
        System.out.println("items = " + items);

        System.out.println(items.putIfAbsent("Berry", 4.3));  // putIfAbsent eger yoksa ekle demek. varsa eski degeri döndürür. varsa yeni degeri ekler.
        System.out.println("items = " + items);


        System.out.println("Apple in  the List? : " + items.containsKey("Apple"));
        System.out.println("Orange in  the List? : " + items.containsKey("Orange"));

        System.out.println("Any items in the List ? : "+items.containsValue(2.5));
        System.out.println("Any items in the List ? : "+items.containsValue(6.5));

        System.out.println(items.get("Orange") + 4.5);   //  get(key)  double deger döndürdügü icin matematiksel isleme tabi tutulabilir.

    }
}
