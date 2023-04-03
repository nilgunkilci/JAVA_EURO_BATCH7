package days.GrupArbeit;

public class Collection_List {
    // Java'da "collection" terimi, bir araya getirilmiş nesnelerin bir koleksiyonunu temsil eder.
    // Java Collection Framework, Java programlama dilindeki temel veri yapılarını ve bunların kullanımını sağlar.


    //Java Collection Framework, Java programlama dilindeki veri yapılarına yönelik bir kütüphanedir
    // Java Collection Framework, farklı türdeki veri yapılarına (List, Set, Map vb.) yönelik bir dizi arayüz ve class sağlar
    /*Java Collection Framework, koleksiyonlardaki öğelerin eklenmesi, çıkarılması, aranması, sıralanması, filtrelenmesi gibi
     çeşitli işlemleri gerçekleştirmek için bir dizi metot sağlar.
     Bu metotlar, bir koleksiyonun özelliklerini değiştirmek veya koleksiyondaki öğeleri işlemek için kullanılır.
     */
    //  Java uygulamalarında veri işleme işlemlerinin büyük bir kısmını kolaylaştırır ve hızlandırır.
    //  Bu nedenle, Java programlama dilindeki veri yapıları hakkında bilgi sahibi olmak, bir Java programcısı için oldukça önemlidir.

    // SET, yinelenmeyen öğelerden oluşan bir grup depolar.
    // LIST, sıralı bir öğe koleksiyonunu saklar.
    // STACK, son giren ilk çıkar şeklinde işlenen nesneleri depolar.
    // QUEUE, ilk giren ilk çıkar şeklinde işlenen nesneleri depolar.
    // PRIORTY QUEUE, işlenen nesneleri öncelik sırasına göre saklar.

    // COLLECTION FRAMEWORK YAPISI ve METOTLARI
    /*
    Java Collection Interface, diğer tüm koleksiyonlar için temel özelliklerin tanımlandığı bir arayüzdür.

** add(E e): Bu metot, koleksiyona belirtilen öğeyi ekler ve
             eklemeye başarılı olduysa true değerini döndürür.

** addAll(Collection<? extends E> c): Bu metot, belirtilen koleksiyondaki tüm öğeleri mevcut koleksiyona ekler
                                      ve koleksiyon değiştirilirse true değerini döndürür.

** remove(Object o): Bu metot, belirtilen öğeyi koleksiyondan çıkarır
                     ve çıkarma başarılıysa true değerini döndürür.

** removeAll(Collection<?> c): Bu metot, belirtilen koleksiyonda yer alan tüm öğeleri mevcut koleksiyondan çıkarır
                               ve koleksiyon değiştirilirse true değerini döndürür.

** retainAll(Collection<?> c): Bu metot, belirtilen koleksiyondaki öğeler dışındaki tüm öğeleri mevcut koleksiyondan çıkarır
                                ve koleksiyon değiştirilirse true değerini döndürür.

** contains(Object o): Bu metot, koleksiyonun belirtilen öğeyi içerip içermediğini kontrol eder
                        ve true veya false değerini döndürür.

** containsAll(Collection<?> c): Bu metot, belirtilen koleksiyondaki tüm öğelerin mevcut koleksiyonda olup olmadığını kontrol eder
                                 ve true veya false değerini döndürü
     */

                // LIST INTERFACE
    // concrete class lari ArrayList ve LinkedList
    // duplicate na izin veriyor

                // ArrayLIST Class
    // Dinamik bir list yapisidir. Boyutu kücülüp büyüyebilir.
    // Array lerde oldugu gibi index numarasina göre elemanlar sirayla dizilir
    // Duplicate value ya izin verir.
    // Primitive data typlerdan ArrayList olusturulmaz. bunun yerine wrapper class daki objeler kullanilir.

                // LINKEDLIST Class
    //  LinkedList, veri yapısı olarak bağlantılı liste (linked list) kullanarak elemanları depolayan bir sınıftır.
    // LinkedList, elemanları eklemek, çıkarmak ve aramak gibi işlemleri hızlı bir şekilde gerçekleştirmeye olanak tanır.
    // her eleman, kendisinden önceki ve sonra gelen elemanları gösteren referanslarla birbirine bağlıdır.
    // Bu sayede, elemanların ekleme veya çıkarma işlemleri sırasında veri yapısının boyutu değişebilir ve elemanlar arasında boşluk oluşmaz.



    // ******


}
