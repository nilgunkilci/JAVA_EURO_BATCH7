package days.day43_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingStar2 {

        public static void main(String[] args) {

            // Listede yer alan isimlerden 3 karakterli olanlarinin onune 3 yildiz koyarak yeni bir liste olusturan method yaziniz

            ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmet","Can","Semih","Cem","Kaan","Tom","Max","Tim","Michael"));

            System.out.println(addingStar(names));
        }

        public static ArrayList addingStar(ArrayList<String> words){

            ArrayList<String> temp = new ArrayList<>();

            for(String word : words){
                if(word.length() == 3){
                    temp.add("***");
                }
                temp.add(word);
            }

//        words.clear();
//        words.addAll(temp);
            return temp;
        }
    }

