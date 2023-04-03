package days.GrupArbeit;

public class yarisma3 {
    public static void main(String[] args) {
        String [] isimler ={"Betül","Mustafa","Hakan","Hanzel","Mete","Mehmet"};

        for (String s : isimler) {
            if (s.equals("Hanzel") || s.equals("Betül")) {


                continue;


            }
            System.out.print(s+" ");

        }
    }
}
