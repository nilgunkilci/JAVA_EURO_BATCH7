package days.day63_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformansAddSeqzential {

    public static void main(String[] args) {
        long baslangicZamani = System.nanoTime();       // System.nanoTime(); nano zamanda sürayi ölcer. bunun icin hem baslangic hem bitis atamasi yapilmali
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <10_000_000; i++){
            arrayList.add(i);
        }
        long bitisZamani = System.nanoTime();
        System.out.println("Adding performance(ArrayList)   : " + (bitisZamani - baslangicZamani) + " nano seconds.");

        baslangicZamani = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <10_000_000; i++){
            linkedList.add(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Adding performance(LinkedList)  : " + (bitisZamani - baslangicZamani) + " nano seconds.");

        // ****** Sirali ekleme yaparken ArrayList daha hizli
/*
        System.out.println("Reading data sequentially");
        baslangicZamani = System.nanoTime();
        for (int i = 0; i <100000; i++){
            arrayList.get(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Reading performance(ArrayList) : " + (bitisZamani - baslangicZamani) + " nano seconds.");*/


       /* System.out.println("Reading data sequentially");
        baslangicZamani = System.nanoTime();
        for (int i = 0; i <100000; i++){
            linkedList.get(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Reading performance(LinkedList) : " + (bitisZamani - baslangicZamani) + " nano seconds.");*/

        // ***** Reading performance da ArrayList daha hizli

        System.out.println("Adding data with index");
        baslangicZamani = System.nanoTime();
        arrayList.add(50000,100);
        arrayList.add(50000,100);
        arrayList.add(50000,100);
        arrayList.add(50000,100);
        bitisZamani = System.nanoTime();
        System.out.println("Adding performance(ArrayList)   : " + (bitisZamani - baslangicZamani) + " nano seconds.");

        System.out.println("Adding data with index");
        baslangicZamani = System.nanoTime();
        linkedList.add(50000,100);
        linkedList.add(50000,100);
        linkedList.add(50000,100);
        linkedList.add(50000,100);
        bitisZamani = System.nanoTime();
        System.out.println("Adding performance(LinkedList)  : " + (bitisZamani - baslangicZamani) + " nano seconds.");
        // ****** Büyük listelerde araya eleman ekleme ve cikarma LinkedList daha hizli 10.000.000 luk kayitlar gibi


    }
}
