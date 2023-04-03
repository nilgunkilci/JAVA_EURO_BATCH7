package days.day43_Review;

import java.util.ArrayList;

public class EqualsMethod {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println(list1.toString());

        ArrayList<String> list2 = list1;
        System.out.println(list2.toString());

        ArrayList<String> months = new ArrayList<>(list2);
        System.out.println(months.toString());

        months.add("Jun");

        if(months.equals(list1)){
            System.out.println("Months list match with list1");
        }else{
            System.out.println("Months list dont match with list1");
        }
    }
}
