package days.day15;

public class SwitchToTernary {


    public static void main(String[] args) {
        int not = 71;
        String puan = "";

        switch (not){
            case 90 :
                puan ="puaniniz A";
                break;
            case 80 :
                puan ="puaniniz B";
                break;
            case 70 :
                puan ="puaniniz C";
                break;
            case 60 :
                puan ="puaniniz D";
                break;
            case 50 :
                puan ="puaniniz E";
                break;
            default :
                puan = "Kaldiniz";
        }
        System.out.println("puan = " + puan);

        // Switch to Ternary

        puan =    (not >= 90) ? "puaniniz A"
                : (not >= 80) ? "puaniniz B"
                : (not >= 70) ? "puaniniz C"
                : (not >= 60) ? "puaniniz D"
                : (not >= 50) ? "puaniniz E"
                : "Kaldiniz";

        System.out.println("puan = " + puan);
    }

    }
