package days.day12_Review;

public class LogicialOperatorTekrar {
    public static void main(String[] args) {

        // &&     ||      !
        // and    or     not
        // ve    veya    degil

        boolean gunHaftasonuMu = true;
        boolean sicaklik20Ustumu = true;
        boolean piknigeGidiyormuyuz = gunHaftasonuMu && sicaklik20Ustumu;
        if (piknigeGidiyormuyuz == true) {
            System.out.println("Oley piknige Gidiyoruz");

            int num = 61;
            boolean sonuc = (num > 20 && num < 40) || (num > 60 && num < 80);
            System.out.println("sonuc = " + sonuc);

            int num1=9;
            System.out.println("num1%10 = " + num1 % 10);
            boolean numara2HaneliMi= num1<9&&(num1%10>0&&num1%10<10);
            System.out.println("numara2HaneliMi = " + numara2HaneliMi);

            int not1=70;
            double harclik=100;

            if(not1>90){
                System.out.println("aferim ogluma cok basarilisin");
            }else {
                System.out.println("üzülme, olacak insallah");
            }


        }

    }
}
