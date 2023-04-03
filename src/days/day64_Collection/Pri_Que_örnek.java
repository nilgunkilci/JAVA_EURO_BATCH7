package days.day64_Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Pri_Que_örnek {
    public static void main(String[] args) {

        String ayrac= "_____________________";
        ///---> Generic PriorityQueue Tanımlaması <---\\\
        PriorityQueue <Integer> queue = new PriorityQueue<>();
        ///---> Kuyruk İçerisine Bazı Veriler Ekleyelim <---\\\
        queue.add(30);
        queue.offer(20);
        queue.add(10);
        queue.offer(40);
        ///---> Diğer Metot Yapılarını Kullanmadan Önce Kuyruğumuzdaki Verilerin Görünüşüne Bakalım <---\\\
        System.out.println(ayrac+"\n< PriorityQueue Metotları >\n"+ayrac);
        System.out.print("-> Kuyruk İçerisindeki Değerler: ");
        queue.forEach( i -> System.out.print("["+i+"]")); ///---> Collections yapılarının genelinde bulunan foreach tanımlaması <---\\\
        System.out.println("\n"+ayrac);
        Iterator <Integer> iterator = queue.iterator(); ///---> İterator Kullanımı <---\\\
        System.out.print("-> Iterator Metot Kullanımı Sonucunda Değerler: ");
        while(iterator.hasNext()){
            System.out.print("["+iterator.next()+"]");
        }
        System.out.println("\n-> Size Metot Kullanımı: "+queue.size()+" öğe bulunuyor.");
        System.out.println("-> Poll Metot Kullanımı ile İlk Değere Ulaşmak: "+queue.poll());
        System.out.print("-> Yeni Kuyruk Yapısı: ");
        queue.forEach(i -> System.out.print("["+i+"]"));
        System.out.println("\n-> Peek Metot Kullanımı ile İlk Değere Ulaşmak: "+queue.peek());
        System.out.println("peek metoddan sonra dizi yapisi = " + queue);
        System.out.print("-> Remove(40) Metot Kullanımı: ");
        System.out.println("queue.remove(40) = " + queue.remove(40));
        queue.forEach(i -> System.out.print("["+i+"]"));
        System.out.println("\n-> Contains(40) Metot Kullanımı: "+queue.contains(40)+"\n"+ayrac);
    }
}
