package days.day63_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceMemoryUsage {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();//Hafıza kullanımını yaklaşık ölçebilmek için Runtime class ından bir instance oluşturuyoruz.

        //ArrayList oluşturmadan önceki hafıza durumunu hesaplıyoruz.
        long oncekiHafizaArrayList = runtime.totalMemory() - runtime.freeMemory();

        // 10_000_000 elemanlı ArrayList oluşturuyoruz
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20_000_000; i++) {
            arrayList.add(i);
        }

        //ArrayList oluşturduktan sonraki hafıza durumunu hesaplıyoruz.
        long sonrakiHafizaArrayList = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("ArrayList hafıza kullanımı  : " + (sonrakiHafizaArrayList - oncekiHafizaArrayList) + " bytes");
        System.out.println("ArrayList hafıza kullanımı  : " + ((sonrakiHafizaArrayList - oncekiHafizaArrayList)/1024) + " kilo bytes");
        System.out.println("ArrayList hafıza kullanımı  : " + ((sonrakiHafizaArrayList - oncekiHafizaArrayList)/1024)/1024 + " mega bytes");

        //LinkedList oluşturmadan önceki hafıza durumunu hesaplıyoruz.
        long oncekiHafizaLinkedList = runtime.totalMemory() - runtime.freeMemory();

        // 10_000_000 elemanlı LinkedList oluşturuyoruz
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 20_000_000; i++) {
            //      System.out.print( "\r" + i);
            linkedList.add(i);
        }
        System.out.println();
        //LinkedList oluşturduktan sonraki hafıza durumunu hesaplıyoruz.
        long sonrakiHafizaLinkedList = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("LinkedList hafıza kullanımı : " +(sonrakiHafizaLinkedList - oncekiHafizaLinkedList + " bytes"));
        System.out.println("LinkedList hafıza kullanımı : " +((sonrakiHafizaLinkedList - oncekiHafizaLinkedList)/1024) + " kilo bytes");
        System.out.println("LinkedList hafıza kullanımı : " +((sonrakiHafizaLinkedList - oncekiHafizaLinkedList)/1024)/1024 + " mega bytes");
    }
}
