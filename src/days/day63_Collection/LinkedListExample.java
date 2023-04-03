package days.day63_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        List <Integer> sayilar = new LinkedList<>();
        Collection<Integer> harfler = new ArrayList<>();
        linkedList.add(12);
        linkedList.add(34);
        System.out.println("linkedList = " + linkedList);
        linkedList.push(45);  // ilk siraya ekleme yapiyor. push metodu linkelist e ait
        linkedList.push(44);
        linkedList.add(44);
        System.out.println(linkedList);
        System.out.println("linkedList.peek() = " + linkedList.peek());
        linkedList.remove();
        System.out.println("linkedList = " + linkedList);
        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        // List interface ile object olusturmak. böylece ihtiyac halinde ArrayList ya da LinkedList e dönüs yaoilabilir.
        // fakat gelen metodlar classa özel metodlar olarak gelir

        List<Integer> liste = new ArrayList<>();
        liste.add(123);




        liste = new LinkedList<>();  // ArrayList i, LinkedListe cevirdik
        liste.add(1);
        //  ???????????? liste.push



    }
}
