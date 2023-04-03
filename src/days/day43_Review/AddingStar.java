package days.day43_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingStar {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>(Arrays.asList("Ahmet","Can","Semih","Cem","Kaan","Tom","Max","Tim","Michael"));


        yildizlinames(names);
    }

    public static void yildizlinames(ArrayList<String> list){


        for(int i=0; i<list.size();i++){

            if (list.get(i).length()==3){
                list.set(i,"***"+list.get(i));

            }

        }
        System.out.println(list.toString());


    }
}
