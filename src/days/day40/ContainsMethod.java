package days.day40;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsMethod {

    public static void main(String[] args) {

        ArrayList<String > list1= new ArrayList<>();
        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println("list1  = " + list1.toString());

        ArrayList<String> list2=list1;

        System.out.println("list2  = " + list2.toString());

        ArrayList<String> months= new ArrayList<>(list2);
        System.out.println("months.toString() = " + months.toString());

        System.out.println("months.contains(\"Jan\") = " + months.contains("Jan"));
        System.out.println("months.contains(\"Dec\") = " + months.contains("Dec"));

        System.out.println("months.get(2)==\"Mar\" = " + (months.get(2) == "Mar"));
        System.out.println("months.get(2).equals(\"Mar\") = " + months.get(2).equals("Mar"));
        System.out.println(months.indexOf("Mar") == 2);

        if (months.containsAll(list1)){

            System.out.println(" List1 exists in Months");
        }else {
            System.out.println(" List1 does not exist in Months");
        }

        ArrayList<String> newList=new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        System.out.println("newList.toString() = " + newList.toString());
    }
}
