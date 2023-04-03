package days.day66_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlayerMap {

    public static void main(String[] args) {

        ArrayList<String> players = new ArrayList<>();
        players.add("Messi");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        Map<Integer, String> playerNumbers = new LinkedHashMap<>();
        playerNumbers.put(10,"Messi");
        playerNumbers.put(7, "Ronaldo");
        playerNumbers.put(11, "Rivaldo");
        //  playerNumbers.put("Bale"+11)


        System.out.println("10 numarali formayi giyen futbolcu : " + playerNumbers.get(10));
        System.out.println("7 numarali formayi giyen futbolcu : " + playerNumbers.get(7));
        System.out.println("11 numarali formayi giyen futbolcu : " + playerNumbers.get(11));



    }
}
