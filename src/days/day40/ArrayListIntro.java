package days.day40;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> nameList= new ArrayList<>();
        nameList.add("Ahmet");
        nameList.add("Ayse");
        nameList.add("Hasan");
        nameList.add("Emine");

        // ArrayList<int> list1=new ArrayList<int>(); primitive data type lardan arrayList olusturulamaz.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(25);
        numbers.add(50);
        numbers.add(63);

        // arka planda otomatik olarak yapilir
        Integer num2=35;
        numbers.add(num2);

        // Eger sayi String olarak geliyorsa
        //numbers.add("45"); //eror

        Integer num=new Integer("68"); // String olarak sayi verebilmek icin Integer wrapper classda obje olusturuyoruz
        numbers.add(num);

        // ppratik olarak String veriyi Integer objeckt e cevirme yolu
        numbers.add(new Integer("45"));

        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));
        System.out.println(nameList.get(2));
        System.out.println(nameList.get(3));

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(4));
        System.out.println(numbers.get(5));
        System.out.println(numbers.get(6));
        //System.out.println(numbers.get(7));// Error IndexOutOfBoundsException

        System.out.println("size of nameList : "+nameList.size());
        System.out.println("size of numbersList : "+numbers.size());

        System.out.println(nameList.toString());
        System.out.println(numbers.toString());

        System.out.println("nameList = " + nameList);
        System.out.println("numbers = " + numbers);

        //String list1=nameList;
        // String list2=numbers;  Bu sekilde bir stringe atama yapilamaz

        // String e atama yapabilmek icin To.String method u kullaniyoruz
        String list3= nameList.toString();
        String list4= numbers.toString();


    }
}
