package days.day64_Collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();     // Queue interface oldugu icin object creta edemeyiz.
        // Queue implement eden bir classda ( LinkedLest) den object olusturduk
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        // FIFO
        System.out.println(que);
        que.forEach(i -> System.out.print(i +","));
        System.out.println();
        //First Out /removes first element in the list
        String name = que.remove();  // ilk giren Cemil oldugu icin ilk cikan cemil olur
        System.out.println("name = " + name);
        System.out.println("que = " + que);


        //First Put /removes first element in the list
        name = que.poll();       // poll() metodu remove gıbı elemet cıkerır
        System.out.println("name = " + name); // sonra Ahmet cikar
        System.out.println("que = " + que);

        // gets the first element in the order, yani ilk elementi bize verir. get(0) gibi
        name = que.peek();
        System.out.println("name = " + name);
        System.out.println("que = " + que);


                // Difference between remove() and poll()
        que.poll();
        que.poll();
        que.poll();  // poll() methodu olmayani elemani cikartmak istediginde exception hata vermez.
        System.out.println("que = " + que);

        //  que.remove();  // remove() methodu  olmayani elemani cikartmak istediginde
        // exception hatasi veriyor.

        try{
            que.remove();
        }catch (NoSuchElementException n){
            System.out.println("Your List ist empty");
        }
    }
}
