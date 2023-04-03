package days.day40;

import java.util.ArrayList;

public class RemoveInteger {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();
        System.out.println(" size of nums = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());
        System.out.println("nums.size()==0 = " + (nums.size() == 0));


        nums.add(1);
        nums.add(34);
        nums.add(56);
        nums.add(75);
        nums.add(54);
        nums.add(86);
        nums.add(95);

        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + !nums.isEmpty());
        System.out.println("nums.size()== 0 = " + (nums.size() == 0));

        System.out.println("nums.toString() = " + nums.toString());

        nums.remove(5);
        System.out.println("nums.toString() = " + nums.toString());



        System.out.println("nums.remove(1) = " + nums.remove(1));
        System.out.println("nums.toString() = " + nums.toString());

       // nums.remove(95); // run da Error veriyor

        nums.remove(new Integer(95));
        System.out.println("nums.toString() = " + nums.toString());

        Integer num=56;
        System.out.println("nums.remove(num) = " + nums.remove(num));// true
        nums.remove(num);
        System.out.println("nums.remove(num) = " + nums.remove(num));// false
        System.out.println("nums.toString() = " + nums.toString());


        System.out.println(".................................................");
        ArrayList<String > carList= new ArrayList<>();

        carList.add("Feraari");
        carList.add("BMW");
        carList.add("Mercedes");

        System.out.println("carList eskiListe = " + carList.toString());

        carList.set(1,"Opel");
        System.out.println("carList yeniListe = " + carList.toString());


    }
}
